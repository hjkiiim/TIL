package org.example.behavioralPattern.iterator.socialNetworks;

import org.example.behavioralPattern.iterator.iterator.LinkedInIterator;
import org.example.behavioralPattern.iterator.iterator.ProfileIterator;
import org.example.behavioralPattern.iterator.profile.Profile;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LinkedIn implements SocialNetwork{
    private final List<Profile> contacts;
    public LinkedIn(List<Profile> cache){
        this.contacts = Objects.requireNonNullElseGet(cache, ArrayList::new);
    }
    public Profile requestContactInfoFromLinkedInAPI(String profileEmail){
        simulateNetworkLatency();
        System.out.println("LinkedIn : Loading profile '" + profileEmail + "' over the network...");
        return findContact(profileEmail);
    }
    public List<String> requestRelatedContactsFromLinkedInAPI(String profileEmail, String contactType){
        simulateNetworkLatency();
        System.out.println("LinkedIn: Loading '" + contactType + "' list of '" + profileEmail + "' over the network...");
        Profile profile = findContact(profileEmail);

        if (profile != null) {
            return profile.getContacts(contactType);
        }
        return null;
    }
    private Profile findContact(String profileEmail) {
        for (Profile profile : contacts) {
            if (profile.getEmail().equals(profileEmail)) {
                return profile;
            }
        }
        return null;
    }

    private void simulateNetworkLatency(){
        try {
            Thread.sleep(2500);
        } catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public ProfileIterator createFriendsIterator(String profileEmail) {
        return new LinkedInIterator(this, "friends", profileEmail);
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileEmail) {
        return new LinkedInIterator(this, "coworkers", profileEmail);
    }
}
