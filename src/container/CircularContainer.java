package container;

public class CircularContainer extends Container{
    //vars
    private double height;
    private double radius;
    //abstract methods

    @Override
    public double calcTopPerimeter() {
        double perimeter;
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    @Override
    public double calcTopArea() {
        double area;
        area = Math.PI*radius*radius;
        return area;
    }

    @Override
    public String toString() {
        return "CircularContainer{" +
                "height=" + height +
                ", radius=" + radius +
                "} ";
    }

    public CircularContainer(double height, double radius) {
        super(height);
        this.height = height;
        this.radius = radius;
    }
}
