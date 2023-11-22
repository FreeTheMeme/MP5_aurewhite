package container;

public abstract class Container {
    //abstract vars and methods
    private double height;

    public Container(double height) {
        this.height = height;
    }


    public abstract double calcTopPerimeter();
    public abstract double calcTopArea();
    //Concrete Methods
    public double calcVolume(){
        double volume;
        volume = height * calcTopArea();
        return volume;
    }
    public double calcSurfaceArea(){
        double surface;
        surface = 2 * calcTopArea() + height * calcTopPerimeter();
        return surface;
    }
}
