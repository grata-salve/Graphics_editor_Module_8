package forms;

public interface ThreeDimensionalShape {
    default String figureName(ThreeDimensionalShape threeDimensionalShape) {
        return threeDimensionalShape.getClass().getSimpleName();
    }

    double calculateArea();
    double calculatePerimeter();
}
