package com.gsu.example.patterns.shape.implementation;

import com.gsu.example.patterns.shape.AbstractShape;
import com.gsu.example.patterns.shape.Dimensions;
import com.gsu.example.patterns.shape.PointStatus;

import java.util.Objects;

public class Rectangle extends AbstractShape {

    private int height;
    private int width;

    public Rectangle(int height, int width, boolean fill) {
        super(fill);
        this.height = height;
        this.width = width;
    }

    @Override
    public Dimensions getDimensions() {
        return new Dimensions(height+1, width+1);
    }

    @Override
    public PointStatus pointStatusFor(int height, int width) {
        if (height < 0 || width < 0 || height > this.height || width > this.width) {
            return PointStatus.OUTSIDE;
        } else if (height == 0 || width == 0 || height == this.height || width == this.width) {
            return PointStatus.BORDER;
        } else {
            return PointStatus.INSIDE;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return height == rectangle.height &&
                width == rectangle.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width);
    }
}
