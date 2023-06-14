package org.example.structuralPattern.decorator.decorator;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DataSourceDecorator implements DataSource{
    private DataSource wrappee;

    DataSourceDecorator(DataSource source){
        this.wrappee = source;
    }
    @Override
    public void writeData(String data){
        wrappee.writeData(data);
    }
    @Override
    public String readData(){
        return wrappee.readData();
    }
}
