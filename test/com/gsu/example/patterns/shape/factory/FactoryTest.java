package com.gsu.example.patterns.shape.factory;

import com.gsu.example.patterns.shape.implementation.Circle;
import com.gsu.example.patterns.shape.implementation.Triangle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactoryTest {

    private ShapeFactory testedBorderFactory = new BorderShapeFactory();
    private ShapeFactory testedFilledFactory = new FilledShapeFactory();

    @Test
    public void circleCreationTest() {
        assertEquals(
                testedBorderFactory.createCircle(5),
                new Circle(5, false)
        );
        assertEquals(
                testedFilledFactory.createCircle(6),
                new Circle(6, true)
        );
    }

    @Test
    public void triangleCreationTest() {
        assertEquals(
                testedBorderFactory.createTriangle(5,3),
                new Triangle(5,3, false)
        );
        assertEquals(
                testedFilledFactory.createTriangle(6,4),
                new Triangle(6,4, true)
        );
    }
}
