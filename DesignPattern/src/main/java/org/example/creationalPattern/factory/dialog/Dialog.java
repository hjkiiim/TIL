package org.example.creationalPattern.factory.dialog;

import org.example.creationalPattern.factory.button.Button;

public abstract class Dialog {
    public void renderWindow(){
        Button okButton = createButton();
        okButton.render();
    }
    public abstract Button createButton();
}
