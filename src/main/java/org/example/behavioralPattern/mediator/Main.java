package org.example.behavioralPattern.mediator;

import org.example.behavioralPattern.mediator.component.*;
import org.example.behavioralPattern.mediator.mediator.Editor;
import org.example.behavioralPattern.mediator.mediator.Mediator;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
