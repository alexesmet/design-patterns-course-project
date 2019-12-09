package com.gsu.example.patterns.shape.factory;

import com.gsu.example.patterns.shape.implementation.Circle;
import com.gsu.example.patterns.shape.implementation.Rectangle;
import com.gsu.example.patterns.shape.implementation.Square;
import com.gsu.example.patterns.shape.implementation.Triangle;

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
