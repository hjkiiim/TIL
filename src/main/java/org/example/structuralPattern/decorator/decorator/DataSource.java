package org.example.structuralPattern.decorator.decorator;

public interface DataSource {
    void writeData(String data);
    String readData();
}
