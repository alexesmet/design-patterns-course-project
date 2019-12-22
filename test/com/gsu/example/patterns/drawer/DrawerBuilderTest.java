package com.gsu.example.patterns.drawer;

import org.junit.Assert;
import org.junit.Test;

public class DrawerBuilderTest {

    @Test
    public void testClassicBehaviour() {
        PrintDrawer expected = new PrintDrawer(System.out, ' ', '#', '$', 0, 2);
        Drawer actual = new DrawerBuilder()
                .withBorderChar('#')
                .withFillChar('$')
                .withMarginTop(2)
                .build();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSeveralUsages() {
        PrintDrawer defaultExpected =
                new PrintDrawer(System.out,' ','#','%',0,0);
        DrawerBuilder drawerBuilder = new DrawerBuilder();
        Drawer defaultActual = drawerBuilder.build();
        Drawer alteredActual = drawerBuilder
                .withIndentSize(5)
                .build();

        Assert.assertEquals(defaultExpected, defaultActual);
        Assert.assertNotEquals(defaultExpected, alteredActual);
    }
}
