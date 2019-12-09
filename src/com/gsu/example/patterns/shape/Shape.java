package com.gsu.example.patterns.shape;

public interface Shape {

    Dimensions getDimensions();
    boolean isFilled();
    PointStatus pointStatusFor(int height, int width);
}
