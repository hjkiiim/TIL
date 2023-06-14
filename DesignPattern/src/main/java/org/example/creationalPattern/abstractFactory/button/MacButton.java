package org.example.creationalPattern.abstractFactory.button;

public class MacButton implements Button{
    @Override
    public void paint(){
        System.out.println("You have created MacButton.");
    }
}
