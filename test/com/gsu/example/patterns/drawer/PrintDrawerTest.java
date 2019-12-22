package com.gsu.example.patterns.drawer;

import com.gsu.example.patterns.shape.Dimensions;
import com.gsu.example.patterns.shape.Shape;
import com.gsu.example.patterns.shape.implementation.Rectangle;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockingDetails;
import org.mockito.Mockito;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

public class PrintDrawerTest {

    // Store these chars in constants, because we will
    // need them to verify what was printed
    private static char BORDER_CHAR = '#';
    private static char FILL_CHAR = '%';

    // Create a mocked stream that will remember, how much times
    // each of it's method was called
    private PrintStream mockStream =
            Mockito.mock(PrintStream.class);
    // Create tested object based on mocked print stream
    // with default settings
    private PrintDrawer testedDrawer =
            new PrintDrawer(mockStream, ' ', BORDER_CHAR, FILL_CHAR,0,0);

    @Test
    public void defaultDrawerUsageTest() {
        // Different rectangles that we will test
        List<Rectangle> setOfTesterRectangles = Arrays.asList(
                new Rectangle(1, 1, true),
                new Rectangle(2, 5, true),
                new Rectangle(4, 1, true),
                new Rectangle(9, 9, true)
        );
        for (Rectangle rect : setOfTesterRectangles) {
            // Make drawer print each rectangle
            testedDrawer.draw(rect);
            // Check that border character was printed
            // correct amount of times
            Mockito.verify(mockStream, Mockito.times(borderLengthForRectangle(rect))).print(BORDER_CHAR);
            // Check that fill character was printed
            // correct amount of times
            Mockito.verify(mockStream, Mockito.times(innerAreaForRectangle(rect))).print(FILL_CHAR);
            // Make mock object forget all previous calls
            Mockito.reset(mockStream);
        }
    }

    // Helper function for calculating amount
    // of border characters for passed rectangle
    private static int borderLengthForRectangle(Rectangle rectangle) {
        Dimensions dim = rectangle.getDimensions();
        return dim.getHeight() * 2 + dim.getWidth() * 2 - 4;
    }
    // Helper function for calculating amount
    // of fill characters for passed rectangle
    private static int innerAreaForRectangle(Rectangle rectangle) {
        Dimensions dim = rectangle.getDimensions();
        return (dim.getHeight() - 2) * (dim.getWidth() - 2);
    }
}
