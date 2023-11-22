package container;

public class CircularContainer extends Container {
    private double height;
    private double radius;
    @Override
    public void setHeight(double height) {
        this.height = height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcTopArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calcTopPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "CircularContainer{" +
                "height=" + height +
                ", radius=" + radius +
                '}';
    }
    public CircularContainer(double height, double radius) {
        super(height);
        setHeight(height);
        setRadius(radius);
    }

}
