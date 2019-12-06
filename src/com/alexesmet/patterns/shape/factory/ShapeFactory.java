package com.alexesmet.patterns.shape.factory;

import com.alexesmet.patterns.shape.implementation.Circle;
import com.alexesmet.patterns.shape.implementation.Rectangle;
import com.alexesmet.patterns.shape.implementation.Square;
import com.alexesmet.patterns.shape.implementation.Triangle;

public interface ShapeFactory {
    Circle createCircle(int radius);
    Rectangle createRectangle(int height, int width);
    Square createSquare(int height);
    Triangle createTriangle(int height, int width);
}
