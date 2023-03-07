package org.example.creationalPattern.abstractFactory.factory;

import org.example.creationalPattern.abstractFactory.button.Button;
import org.example.creationalPattern.abstractFactory.button.WindowsButton;
import org.example.creationalPattern.abstractFactory.checkbox.Checkbox;
import org.example.creationalPattern.abstractFactory.checkbox.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton(){
        return new WindowsButton();
    }
    public Checkbox createCheckbox(){
        return new WindowsCheckbox();
    }
}
