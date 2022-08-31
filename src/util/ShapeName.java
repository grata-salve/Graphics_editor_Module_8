package util;

import forms.Shape;

public class ShapeName {
    private static final ShapeName instance = new ShapeName();

    private Shape shape;

    private ShapeName() {
    }

    public static ShapeName getInstance() {
        return instance;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return shape.figureName(shape);
    }
}
