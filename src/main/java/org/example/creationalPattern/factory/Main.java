package org.example.creationalPattern.factory;

import org.example.creationalPattern.factory.dialog.Dialog;
import org.example.creationalPattern.factory.dialog.HtmlDialog;
import org.example.creationalPattern.factory.dialog.WindowsDialog;

public class Main {
    private static Dialog dialog;

    public static void main(String args[]){
        configure();
        runBusinessLogic();
    }

    static void configure(){
        if(System.getProperty("os.name").equals("Windows 10")){
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic(){
        dialog.renderWindow();
    }

}