package util;

import shapes.two_dimensional.TwoDimensionalShape;

import java.awt.*;

public class ShapeName {
    private static final ShapeName instance = new ShapeName();

    private TwoDimensionalShape twoDimensionalShape;

    private ShapeName() {
    }

    public static ShapeName getInstance() {
        return instance;
    }

    public TwoDimensionalShape getShape() {
        return twoDimensionalShape;
    }

    public void setShape(TwoDimensionalShape twoDimensionalShape) {
        this.twoDimensionalShape = twoDimensionalShape;
    }

    public String getShapeName(TwoDimensionalShape twoDimensionalShape) {
        return twoDimensionalShape.figureName(twoDimensionalShape);
    }

    @Override
    public String toString() {
        return twoDimensionalShape.figureName(twoDimensionalShape);
    }
}
