public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        GetShapeName circleShape = new GetShapeName(circle);
        System.out.println(circleShape + " " + circleShape.getShape());

        Triangle triangle = new Triangle(5, 9, 11);
        GetShapeName triangleShape = new GetShapeName(triangle);
        System.out.println(triangleShape + " " + triangle);

        Trapezoid trapezoid = new Trapezoid(1, 4, 2, 3);
        GetShapeName getShapeName = new GetShapeName(trapezoid);
        System.out.println(getShapeName + " " + trapezoid);
    }
}
