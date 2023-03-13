package org.example.behavioralPattern.mediator.mediator;

import org.example.behavioralPattern.mediator.component.Component;

import javax.swing.*;

public interface Mediator {
    void addNewNote(Note note);
    void deleteNote();
    void getInfoFromList(Note note);
    void saveChanges();
    void markNote();
    void clear();
    void sendToFilter(ListModel listModel);
    void setElementsList(ListModel listModel);
    void registerComponent(Component component);
    void hideElements(boolean flag);
    void createGUI();
}
