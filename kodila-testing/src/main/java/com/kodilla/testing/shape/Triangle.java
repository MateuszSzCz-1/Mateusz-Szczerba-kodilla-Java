package com.kodilla.testing.shape;

public class Triangle extends AbstractShape implements Shape{
    private final int field;
    private final int height;
    private int radius;
    public Triangle(String name, int field, int height) {
        super(name);
        this.field=field;
        this.height=height;
    }
    @Override
    public String getShapeName() {
        return this.name;
    }
    @Override
    public double getField() {
        return 0.5*field*height;
    }
}
