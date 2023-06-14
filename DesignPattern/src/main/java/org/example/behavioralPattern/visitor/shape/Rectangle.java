package org.example.behavioralPattern.visitor.shape;

import org.example.behavioralPattern.visitor.visitor.Visitor;

public class Rectangle implements Shape{
    private int id, x, y, width, height;

    public Rectangle(int id, int x, int y, int width, int height){
        this.id = id;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitRectangle(this);
    }

    @Override
    public void move(int x, int y) {

    }

    @Override
    public void draw() {

    }

    public int getId() {
        return id;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
