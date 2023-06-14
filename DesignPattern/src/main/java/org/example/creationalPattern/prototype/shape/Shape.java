package org.example.creationalPattern.prototype.shape;

import java.util.Objects;

public abstract class Shape {
    public int x, y;
    public String color;

    public Shape(){ }

    public Shape(Shape target) {
        if(target != null){
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }
    public abstract Shape clone();
    @Override
    public boolean equals(Object object){
//        instanceof : 객체 클래스 비교
        if(!(object instanceof Shape)) return false;
        Shape shape = (Shape)object;
        return shape.x == x && shape.y == y && Objects.equals(shape.color, color);
    }
}
