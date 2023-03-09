package org.example.behavioralPattern.iterator.socialNetworks;

import org.example.behavioralPattern.iterator.iterator.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);
    ProfileIterator createCoworkersIterator(String profileEmail);
}
