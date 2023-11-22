package container;
public class RectangularContainer extends Container{
    private double height;
    private double width;
    private double length;
    //abs methods

    @Override
    public double calcTopPerimeter() {
        double perimeter;
        perimeter = 2*(width+length);
        return perimeter;
    }

    @Override
    public double calcTopArea() {
        double area;
        area = width * length;
        return area;
    }

    @Override
    public String toString() {
        return "RectangularContainer{" +
                "height=" + height +
                ", width=" + width +
                ", length=" + length +
                "} " ;
    }

    public RectangularContainer(double height, double width, double length) {
        super(height);
        this.height = height;
        this.width = width;
        this.length = length;
    }
}
