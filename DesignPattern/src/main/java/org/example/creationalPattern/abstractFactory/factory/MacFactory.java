package org.example.creationalPattern.abstractFactory.factory;

import org.example.creationalPattern.abstractFactory.button.Button;
import org.example.creationalPattern.abstractFactory.button.MacButton;
import org.example.creationalPattern.abstractFactory.checkbox.Checkbox;
import org.example.creationalPattern.abstractFactory.checkbox.MacCheckbox;

public class MacFactory implements GUIFactory{
    @Override
    public Button createButton(){
        return new MacButton();
    }
    public Checkbox createCheckbox(){
        return new MacCheckbox();
    }
}
