package com.kodilla.testing.shape;

public class Square extends AbstractShape implements  Shape{
    private final int field;
    public Square(String name, int field) {
        super(name);
        this.field = field;
    }
    @Override
    public String getShapeName() {
        return this.name;
    }
    @Override
    public double getField() {
        return field * field;
    }
}

