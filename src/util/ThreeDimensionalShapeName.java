package util;

import shapes.three_dimensional.ThreeDimensionalShape;
import shapes.two_dimensional.TwoDimensionalShape;

public class ThreeDimensionalShapeName {
    private static final ThreeDimensionalShapeName instance = new ThreeDimensionalShapeName();

    private ThreeDimensionalShape threeDimensionalShape;

    private ThreeDimensionalShapeName() {
    }

    public static ThreeDimensionalShapeName getInstance() {
        return instance;
    }

    public ThreeDimensionalShape getThreeDimensionalShape() {
        return threeDimensionalShape;
    }

    public void setThreeDimensionalShape(ThreeDimensionalShape threeDimensionalShape) {
        this.threeDimensionalShape = threeDimensionalShape;
    }

    public String getShapeName(ThreeDimensionalShape threeDimensionalShape) {
        return threeDimensionalShape.figureName(threeDimensionalShape);
    }

    @Override
    public String toString() {
        return threeDimensionalShape.figureName(threeDimensionalShape);
    }
}
