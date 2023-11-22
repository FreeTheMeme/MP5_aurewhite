package container;

public class RegularPolygonContainer extends Container{
    public double height;
    public double side;
    public double numSides;


    public void setHeight(double height) {
        this.height = height;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setNumSides(double numSides) {
        this.numSides = numSides;
    }

    @Override
    public double calcTopArea() {
        return numSides * side * side / ( 4*Math.tan(Math.PI/numSides));
    }

    @Override
    public double calcTopPerimeter() {
        return numSides * side;
    }


    public RegularPolygonContainer(double height,double side, double numSides) {
        super(height);
        setHeight(height);
        setSide(side);
        setNumSides(numSides);
    }

    @Override
    public String toString() {
        return "RegularPolygonContainer{" +
                "height=" + height +
                ", numSides=" + numSides +
                '}';
    }
}
