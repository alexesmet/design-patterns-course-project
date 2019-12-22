package com.gsu.example.patterns.shape.implementation;


import com.gsu.example.patterns.shape.Dimensions;
import com.gsu.example.patterns.shape.PointStatus;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void pointStatusTest() {
        final Rectangle rectangle = new Rectangle(5, 5, true);

        assertEquals(rectangle.pointStatusFor(0,0), PointStatus.BORDER);
        assertEquals(rectangle.pointStatusFor(1,1), PointStatus.INSIDE);
        assertEquals(rectangle.pointStatusFor(9,2), PointStatus.OUTSIDE);
    }

    @Test
    public void dimensionsTest() {
        final Rectangle rectangle = new Rectangle(7,8, true);
        assertEquals(rectangle.getDimensions(), new Dimensions(7 + 1, 8 + 1));
    }
}
