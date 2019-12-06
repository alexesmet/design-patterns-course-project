package com.alexesmet.patterns.shape;

public interface Shape {
    Dimensions getDimensions();
    boolean isFilled();
    PointStatus pointStatusFor(int height, int width);
}
