package container;
public class TriangularContainer extends Container{
    //vars
    private double height;
    private double sideA;
    private double sideB;
    private double sideC;
    //abstract methods

    @Override
    public double calcTopPerimeter() {
        double perimeter;
        perimeter = sideA + sideB + sideC;
        return perimeter;
    }

    @Override
    public double calcTopArea() {
        double area;
        double s;
        s = (sideA + sideB + sideC)/2.0;
        area = Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
        return area;
    }
    //tostr

    @Override
    public String toString() {
        return "TriangularContainer{" +
                "height=" + height +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                "} ";
    }

    //constructor

    public TriangularContainer(double height, double sideA, double sideB, double sideC) {
        super(height);
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
}
