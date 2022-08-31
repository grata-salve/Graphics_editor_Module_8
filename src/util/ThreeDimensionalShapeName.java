package util;

import forms.ThreeDimensionalShape;

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

    @Override
    public String toString() {
        return threeDimensionalShape.figureName(threeDimensionalShape);
    }
}
