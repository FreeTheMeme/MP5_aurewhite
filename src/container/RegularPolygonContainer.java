package container;
public class RegularPolygonContainer extends Container{
    //vars
    private double height;
    private double side;
    private int numbSides;
    //abs methods

    @Override
    public double calcTopPerimeter() {
        double perimeter;
        perimeter = numbSides * side;
        return perimeter;
    }

    @Override
    public double calcTopArea() {
        double area;
        area = numbSides * side * side / ( 4*Math.tan(Math.PI/numbSides));
        return area;
    }
    //tostr


    @Override
    public String toString() {
        return "RegularPolygonContainer{" +
                "height=" + height +
                ", side=" + side +
                ", numbSides=" + numbSides +
                "} ";
    }
    //default constructor

    public RegularPolygonContainer(double height, double side, int numbSides) {
        super(height);
        this.height = height;
        this.side = side;
        this.numbSides = numbSides;
    }
}
