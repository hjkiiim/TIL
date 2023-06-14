package org.example.behavioralPattern.mediator.component;

import org.example.behavioralPattern.mediator.mediator.Mediator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class TextBox extends JTextArea implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }
    @Override
    public void processComponentKeyEvent(KeyEvent keyEvent){
        mediator.markNote();
    }
    @Override
    public String getName(){
        return "TextBox";
    }
}
