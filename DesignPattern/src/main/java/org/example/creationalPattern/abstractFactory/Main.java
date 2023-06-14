package org.example.creationalPattern.abstractFactory;

import org.example.creationalPattern.abstractFactory.app.Application;
import org.example.creationalPattern.abstractFactory.factory.GUIFactory;
import org.example.creationalPattern.abstractFactory.factory.MacFactory;
import org.example.creationalPattern.abstractFactory.factory.WindowsFactory;

public class Main {
    private static Application configureApplication(){
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if(osName.contains("mac")){
            factory = new MacFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }
    public static void main(String[] args){
        Application app = configureApplication();
        app.paint();
    }
}
