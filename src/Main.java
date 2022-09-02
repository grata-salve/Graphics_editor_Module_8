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
        System.out.println(shapeName.getShapeName(circle) + " " + circle);

        Triangle triangle = new Triangle(5, 9, 11);
        System.out.println(shapeName.getShapeName(triangle) + " " + triangle);

        Trapezoid trapezoid = new Trapezoid(1, 4, 2, 3);
        System.out.println(shapeName.getShapeName(trapezoid) + " " + trapezoid);

        ThreeDimensionalShapeName threeDimensionalShapeName = ThreeDimensionalShapeName.getInstance();
        Cube cube = new Cube(8);
        System.out.println(threeDimensionalShapeName.getShapeName(cube) + " " + cube);
    }
}