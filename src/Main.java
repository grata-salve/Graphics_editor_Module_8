import shapes.three_dimensional.Cube;
import shapes.two_dimensional.Circle;
import shapes.two_dimensional.Trapezoid;
import shapes.two_dimensional.Triangle;
import util.ShapeName;
import util.ThreeDimensionalShapeName;

public class Main {
    public static void main(String[] args) {
        ShapeName shapeName = ShapeName.getInstance();
        Circle circle = new Circle(10);
        shapeName.setShape(circle);
        System.out.println(shapeName + " " + circle);

        Triangle triangle = new Triangle(5, 9, 11);
        shapeName.setShape(triangle);
        System.out.println(shapeName + " " + triangle);

        Trapezoid trapezoid = new Trapezoid(1, 4, 2, 3);
        shapeName.setShape(trapezoid);
        System.out.println(shapeName + " " + trapezoid);

        ThreeDimensionalShapeName threeDimensionalShapeName = ThreeDimensionalShapeName.getInstance();
        Cube cube = new Cube(8);
        threeDimensionalShapeName.setThreeDimensionalShape(cube);
        System.out.println(threeDimensionalShapeName + " " + cube);
    }
}