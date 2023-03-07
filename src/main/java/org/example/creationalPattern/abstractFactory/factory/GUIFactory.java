package org.example.creationalPattern.abstractFactory.factory;

import org.example.creationalPattern.abstractFactory.button.Button;
import org.example.creationalPattern.abstractFactory.checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
