package org.example.creationalPattern.factory.dialog;

import org.example.creationalPattern.factory.button.Button;
import org.example.creationalPattern.factory.button.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton(){
        return new WindowsButton();
    }
}
