package com.gsu.example.patterns;

import com.gsu.example.patterns.drawer.Drawer;
import com.gsu.example.patterns.drawer.DrawerBuilder;
import com.gsu.example.patterns.shape.Shape;
import com.gsu.example.patterns.shape.factory.BorderShapeFactory;
import com.gsu.example.patterns.shape.factory.FilledShapeFactory;
import com.gsu.example.patterns.shape.factory.ShapeFactory;
import com.gsu.example.patterns.shape.implementation.Circle;
import com.gsu.example.patterns.shape.implementation.Rectangle;


public class Main {

    public static void main(String[] args) {

        final ShapeFactory filledShapeFactory = new FilledShapeFactory();

        final Shape circle = filledShapeFactory.createCircle(5);
        final Shape square = filledShapeFactory.createSquare(5);
        final Shape triangle = filledShapeFactory.createTriangle(5,10);
        final Shape rectangle = filledShapeFactory.createRectangle(5,12);

        final Drawer drawer = new DrawerBuilder()
                .withMarginTop(2)
                .withIndentSize(2)
                .build();


        drawer.draw(circle);
        drawer.draw(square);
        drawer.draw(triangle);
        drawer.draw(rectangle);

        drawer.draw(new Rectangle(1,5,true));

    }
}
