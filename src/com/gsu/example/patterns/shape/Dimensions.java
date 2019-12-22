package com.gsu.example.patterns.shape;

import java.util.Objects;

public class Dimensions {
    private final int height;
    private final int width;

    public Dimensions(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dimensions)) return false;
        Dimensions that = (Dimensions) o;
        return getHeight() == that.getHeight() &&
                getWidth() == that.getWidth();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHeight(), getWidth());
    }
}
