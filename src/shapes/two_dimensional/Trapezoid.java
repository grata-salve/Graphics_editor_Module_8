package shapes.two_dimensional;

import forms.Quadrangle;

public class Trapezoid implements Quadrangle {
    private int sideA, sideB, sideC, sideD;

    public Trapezoid(int sideA, int sideB, int sideC, int sideD) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }

    public Trapezoid() {
    }

    @Override
    public boolean isAllSidesHaveParallel() {
        return false;
    }

    @Override
    public double calculateArea() {
        float semiPerimeter = (float) (sideA + sideB + sideC + sideD) / 2;
        return ((float)(sideA + sideB) / Math.abs(sideA - sideB)) * Math.sqrt((semiPerimeter - sideA) *
                (semiPerimeter - sideB) * (semiPerimeter - sideC) * (semiPerimeter - sideD));
    }

    @Override
    public double calculatePerimeter() {
        return sideD + sideC + sideB + sideA;
    }

    @Override
    public String toString() {
        return "sides are " + sideA + ", " + sideB + ", " + sideC + ", " + sideD +
                ", so area is " + calculateArea() + " and perimeter is " + calculatePerimeter()
                + ", all sides have parallel: " + isAllSidesHaveParallel();
    }
}
