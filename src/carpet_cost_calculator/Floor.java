package carpet_cost_calculator;

public class Floor {
    double width;
    double length;

    public Floor(double width, double length){
        this.width = width;
        this.length = length;

    }
    public double getArea(){

        return width*length;
    }

}
