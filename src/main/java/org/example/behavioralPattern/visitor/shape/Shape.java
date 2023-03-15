package org.example.behavioralPattern.visitor.shape;

import org.example.behavioralPattern.visitor.visitor.Visitor;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
