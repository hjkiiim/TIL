package org.example.behavioralPattern.iterator.iterator;

import org.example.behavioralPattern.iterator.profile.Profile;
import org.example.behavioralPattern.iterator.socialNetworks.Facebook;

import java.util.ArrayList;
import java.util.List;

public class FacebookIterator implements ProfileIterator{
    private final Facebook facebook;
    private final String type;
    private final String email;
    private int currentPosition = 0;
    private final List<String> emails = new ArrayList<>();
    private final List<Profile> profileList = new ArrayList<>();

    public FacebookIterator(Facebook facebook, String type, String email){
        this.facebook = facebook;
        this.type = type;
        this.email = email;
    }
    private void lazyLoad(){
        if(emails.size() == 0){
            List<String> profileList = facebook.requestProfileFriendFromFacebook(this.email, this.type);
            for(String profile : profileList){
                this.emails.add(profile);
                this.profileList.add(null);
            }
        }
    }

    @Override
    public boolean hasNext() {
        lazyLoad();
        return currentPosition < emails.size();
    }
    @Override
    public Profile getNext(){
        if(!hasNext()){
            return null;
        }
        String friendEmail = emails.get(currentPosition);
        Profile friendProfile = profileList.get(currentPosition);
        if(friendProfile == null){
            friendProfile = facebook.requestProfileFromFacebook(friendEmail);
            profileList.set(currentPosition, friendProfile);
        }
        currentPosition++;
        return friendProfile;
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }
}
