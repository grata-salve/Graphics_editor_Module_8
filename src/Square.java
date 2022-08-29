public class Square implements Quadrangle {
    int side;

    public Square(int side) {
        this.side = side;
    }

    public Square() {
    }

    @Override
    public String figureName() {
        return "Square";
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public boolean isAllSidesHaveParallel() {
        return true;
    }
}
