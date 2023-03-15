package org.example.behavioralPattern.visitor.visitor;

import org.example.behavioralPattern.visitor.shape.Circle;
import org.example.behavioralPattern.visitor.shape.CompoundShape;
import org.example.behavioralPattern.visitor.shape.Dot;
import org.example.behavioralPattern.visitor.shape.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);
    String visitCircle(Circle circle);
    String visitRectangle(Rectangle rectangle);
    String visitCompoundGraphic(CompoundShape cg);
}
