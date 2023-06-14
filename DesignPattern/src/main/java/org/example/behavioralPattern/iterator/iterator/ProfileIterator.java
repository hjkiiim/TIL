package org.example.behavioralPattern.iterator.iterator;

import org.example.behavioralPattern.iterator.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
