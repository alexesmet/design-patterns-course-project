package com.alexesmet.patterns.shape;

public abstract class AbstractShape implements Shape {

    private boolean filled;

    protected AbstractShape(boolean filled) {
        this.filled = filled;
    }

    @Override
    public boolean isFilled() {
        return filled;
    }
}
