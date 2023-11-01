package cylinder;

public class Cylinder extends Circle{

    double height;

    public Cylinder(double radius, double height){
        super(radius);
        this.height=height;

    }

    public double getHeight() {
        return height;
    }
    public double getVolume(){
        return getArea()*height;
    }
}
