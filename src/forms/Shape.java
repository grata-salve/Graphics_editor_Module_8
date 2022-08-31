package forms;

public interface Shape {
    default String figureName(Shape shape) {
        return shape.getClass().getSimpleName();
    }

    double calculateArea();
    double calculatePerimeter();
}
