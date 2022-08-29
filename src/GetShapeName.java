public class GetShapeName {
    private Shape shape;

    public GetShapeName(Shape shape) {
        this.shape = shape;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return shape.figureName();
    }
}
