package shapes.two_dimensional;

public interface TwoDimensionalShape {
    default String figureName(TwoDimensionalShape twoDimensionalShape) {
        return twoDimensionalShape.getClass().getSimpleName();
    }

    double calculateArea();
    double calculatePerimeter();
}
