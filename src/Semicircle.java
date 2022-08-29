public class Semicircle extends Circle {

    public Semicircle(float radius) {
        super(radius);
    }

    public Semicircle() {
    }

    @Override
    public String figureName() {
        return "Semicircle";
    }

    @Override
    public double calculateArea() {
        return super.calculateArea() / 2;
    }

    @Override
    public double calculatePerimeter() {
        return super.calculatePerimeter() / 2;
    }

    @Override
    public float getRadius() {
        return super.getRadius();
    }

    @Override
    public void setRadius(float radius) {
        super.setRadius(radius);
    }
}
