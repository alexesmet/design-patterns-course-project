package com.gsu.example.patterns.drawer;

import java.io.PrintStream;

public class DrawerBuilder {

    private PrintStream out = System.out;
    private char emptyChar = ' ';
    private char borderChar = '#';
    private char fillChar = '%';
    private int indentSize = 0;
    private int marginTopSize = 0;

    public DrawerBuilder() {  }

    public Drawer build() {
        return new PrintDrawer(
                out,
                emptyChar,
                borderChar,
                fillChar,
                indentSize,
                marginTopSize
        );
    }

    public DrawerBuilder withOutputStream(PrintStream out) {
        this.out = out;
        return this;
    }

    public DrawerBuilder withEmptyChar(char c) {
        this.emptyChar = c;
        return this;
    }

    public DrawerBuilder withBorderChar(char c) {
        this.borderChar = c;
        return this;
    }

    public DrawerBuilder withFillChar(char c) {
        this.fillChar = c;
        return this;
    }

    public DrawerBuilder withIndentSize(int c) {
        this.indentSize = c;
        return this;
    }

    public DrawerBuilder withMarginTop(int c) {
        this.marginTopSize = c;
        return this;
    }
}
