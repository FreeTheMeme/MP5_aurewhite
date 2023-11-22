package container;

public abstract class Container {
    private double height;

    public void setHeight(double height) {
        this.height = height;
    }

    public abstract double calcTopArea();
    public abstract double calcTopPerimeter();
    public  double calcVolume(){
        double volume;
        volume = height * calcTopArea();
        return volume;
    }

    public double calcSurfaceArea(){
    return 0;
    }

    public Container(double height) {
        setHeight(height);
    }
}
