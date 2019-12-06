package com.alexesmet.patterns.shape.implementation;

import com.alexesmet.patterns.shape.AbstractShape;
import com.alexesmet.patterns.shape.Dimensions;
import com.alexesmet.patterns.shape.PointStatus;

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
}
