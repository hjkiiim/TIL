package org.example.behavioralPattern.visitor.shape;

import org.example.behavioralPattern.visitor.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class CompoundShape implements Shape{
    public int id;
    public List<Shape> children = new ArrayList<>();

    public CompoundShape(int id){
        this.id = id;
    }

    @Override
    public void draw() {

    }

    @Override
    public void move(int x, int y) {

    }

    public int getId() {
        return id;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCompoundGraphic(this);
    }

     public void add(Shape shape){
        children.add(shape);
     }
}
