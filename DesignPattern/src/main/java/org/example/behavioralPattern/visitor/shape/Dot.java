package org.example.behavioralPattern.visitor.shape;

import org.example.behavioralPattern.visitor.visitor.Visitor;

public class Dot implements Shape{
    private int id, x, y;

    public Dot(){}

    public Dot(int id, int x, int y){
        this.id = id;
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {

    }

    @Override
    public void draw() {

    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitDot(this);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getId() {
        return id;
    }
}
