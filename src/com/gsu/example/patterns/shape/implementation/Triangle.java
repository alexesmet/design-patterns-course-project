package com.gsu.example.patterns.shape.implementation;

import com.gsu.example.patterns.shape.AbstractShape;
import com.gsu.example.patterns.shape.Dimensions;
import com.gsu.example.patterns.shape.PointStatus;

public class Triangle extends AbstractShape {

    private int height;
    private int width;

    public Triangle(int height, int width, boolean filled) {
        super(filled);
        this.height = height;
        this.width = width;
    }

    @Override
    public Dimensions getDimensions() {
        return new Dimensions(height+1, width+1);
    }

    @Override
    public PointStatus pointStatusFor(int height, int width) {
        if (height == this.height) return PointStatus.BORDER;
        double distanceToBorder =
                Math.abs(width - this.width/2.0) - this.width*height/(2d*this.height);
        if (distanceToBorder > 0)  return PointStatus.OUTSIDE;
        if (distanceToBorder > -1) return PointStatus.BORDER;
        else return PointStatus.INSIDE;
    }
}
