public class Triangle implements Shape {
    int sideA, sideB, sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public String figureName() {
        return "Triangle";
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double calculateArea() {
        float semiPerimeter = (float) (calculatePerimeter() / 2);
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) *
                (semiPerimeter - sideB) * (semiPerimeter - sideC));
    }

    @Override
    public String toString() {
        return "sides are " + sideA + ", " + sideB + ", " + sideC +
                ", so area is " + calculateArea() + ", perimeter is " + calculatePerimeter();
    }
}
