package com.alexesmet.patterns.drawer;

import com.alexesmet.patterns.shape.Dimensions;
import com.alexesmet.patterns.shape.Shape;

import java.io.PrintStream;

public class PrintDrawer implements Drawer {

    private final PrintStream out;
    private char emptyChar;
    private char borderChar;
    private char fillChar;
    private int indentSize;
    private int marginTopSize;

    PrintDrawer(PrintStream out, char emptyChar, char borderChar, char fillChar, int indentSize, int marginTopSize) {
        this.out = out;
        this.emptyChar = emptyChar;
        this.borderChar = borderChar;
        this.fillChar = fillChar;
        this.indentSize = indentSize;
        this.marginTopSize = marginTopSize;
    }

    @Override
    public void draw(Shape shape) {
        Dimensions dimensions = shape.getDimensions();
        for (int i = -marginTopSize; i < dimensions.getHeight(); i++) {
            for (int j = -indentSize; j < dimensions.getWidth(); j++) {
                switch (shape.pointStatusFor(i, j)) {
                    case OUTSIDE:
                        out.print(emptyChar);
                        break;
                    case BORDER:
                        out.print(borderChar);
                        break;
                    case INSIDE:
                        out.print(shape.isFilled() ? fillChar : emptyChar);
                        break;
                }
            }
            System.out.println();
        }
    }


}
