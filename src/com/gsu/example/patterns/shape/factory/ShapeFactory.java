package com.gsu.example.patterns.shape.factory;

import com.gsu.example.patterns.shape.implementation.Circle;
import com.gsu.example.patterns.shape.implementation.Rectangle;
import com.gsu.example.patterns.shape.implementation.Square;
import com.gsu.example.patterns.shape.implementation.Triangle;

public interface ShapeFactory {
    Circle createCircle(int radius);
    Rectangle createRectangle(int height, int width);
    Square createSquare(int height);
    Triangle createTriangle(int height, int width);
}
