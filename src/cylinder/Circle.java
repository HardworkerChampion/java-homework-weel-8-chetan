package cylinder;

public class Circle {

    double radius;

    public Circle(double radius){
        this.radius=radius;

    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
       return radius*radius*Math.PI;
    }
}
