package com.gsu.example.patterns.shape.implementation;

import com.gsu.example.patterns.shape.AbstractShape;
import com.gsu.example.patterns.shape.Dimensions;
import com.gsu.example.patterns.shape.PointStatus;

public class Circle extends AbstractShape {
    private int radius;

    public Circle(int radius, boolean filled) {
        super(filled);
        this.radius = radius;
    }

    @Override
    public Dimensions getDimensions() {
        return new Dimensions(radius*2+1, radius*2+1);
    }

    @Override
    public PointStatus pointStatusFor(int height, int width) {
        double distanceToCenter = Math.sqrt(Math.pow(height - radius, 2) + Math.pow(width - radius, 2));
        if (Math.abs(radius-distanceToCenter) < 0.5) {
            return PointStatus.BORDER;
        } else if (distanceToCenter < radius) {
            return PointStatus.INSIDE;
        } else {
            return PointStatus.OUTSIDE;
        }
    }

}
