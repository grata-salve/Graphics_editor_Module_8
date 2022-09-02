package shapes.two_dimensional;

public class Rectangle implements Quadrangle {
    private int height, width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle() {
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (height + width);
    }

    @Override
    public boolean isAllSidesHaveParallel() {
        return true;
    }
}
