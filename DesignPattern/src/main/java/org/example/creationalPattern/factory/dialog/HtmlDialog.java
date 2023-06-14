package org.example.creationalPattern.factory.dialog;

import org.example.creationalPattern.factory.button.Button;
import org.example.creationalPattern.factory.button.HtmlButton;

public class HtmlDialog extends Dialog{
    @Override
    public Button createButton(){
        return new HtmlButton();
    }
}
