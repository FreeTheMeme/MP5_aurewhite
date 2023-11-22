package container;

public class RectangularContainer extends Container {
    private double height;
    private double width;
    private double length;

    public void setHeight(double height) {
        this.height = height;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double calcTopArea() {
        return width * length;
    }

    @Override
    public double calcTopPerimeter() {
        return 2 * (width + length);
    }



    @Override
    public String toString() {
        return "RectangularContainer{" +
                "height=" + height +
                ", width=" + width +
                ", length=" + length +
                '}';
    }

    public RectangularContainer(double height, double width, double length) {
        super(height);
        setHeight(height);
        setWidth(width);
        setLength(length);
    }
}
