package container;

public class TriangularContainer extends Container{
    public double height;
    public double sideA;
    public double sideB;
    public double sideC;



    public void setHeight(double height) {
        this.height = height;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public double calcTopArea() {
       double s = (sideA + sideB + sideC)/2.0;
        return Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
    }

    @Override
    public double calcTopPerimeter() {
        return sideA + sideB + sideC;
    }


    @Override
    public String toString() {
        return "TriangularContainer{" +
                "height=" + height +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }

    public TriangularContainer(double height, double sideA, double sideB, double sideC) {
        super(height);
        setHeight(height);
        setSideA(sideA);
        setSideB(sideB);
        setSideC(sideC);
    }
}
