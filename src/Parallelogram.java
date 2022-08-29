public class Parallelogram implements Quadrangle {
    int sideA, sideB, angle;

    public Parallelogram(int sideA, int sideB, int angle) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.angle = angle;
    }

    public Parallelogram() {
    }

    @Override
    public boolean isAllSidesHaveParallel() {
        return true;
    }

    @Override
    public String figureName() {
        return "Parallelogram";
    }

    @Override
    public double calculateArea() {
        return sideA + sideB * Math.sin(angle);
    }

    @Override
    public double calculatePerimeter() {
        return (sideB + sideA) * 2;
    }
}
