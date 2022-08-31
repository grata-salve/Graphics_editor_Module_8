package shapes.two_dimensional;

import forms.Quadrangle;

public class Parallelogram implements Quadrangle {
    private int sideA, sideB, angle;

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
    public double calculateArea() {
        return sideA + sideB * Math.sin(angle);
    }

    @Override
    public double calculatePerimeter() {
        return (sideB + sideA) * 2;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }
}
