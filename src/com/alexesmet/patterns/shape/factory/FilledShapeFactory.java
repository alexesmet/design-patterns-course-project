package com.alexesmet.patterns.shape.factory;

import com.alexesmet.patterns.shape.implementation.Circle;
import com.alexesmet.patterns.shape.implementation.Rectangle;
import com.alexesmet.patterns.shape.implementation.Square;
import com.alexesmet.patterns.shape.implementation.Triangle;

public class FilledShapeFactory implements ShapeFactory {
    @Override
    public Circle createCircle(int radius) {
        return new Circle(radius, true);
    }
    @Override
    public Rectangle createRectangle(int height, int width) {
        return new Rectangle(height, width, true);
    }
    @Override
    public Square createSquare(int height) {
        return new Square(height, true);
    }
    @Override
    public Triangle createTriangle(int height, int width) {
        return new Triangle(height, width, true);
    }
}
