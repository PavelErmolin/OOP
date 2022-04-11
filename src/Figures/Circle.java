package Figures;

import java.util.ArrayList;

public class Circle extends Figure {

    private double circumference;
    private double area;
    public Circle(ArrayList<Point> points){
        super(points);
    }

    @Override
    public double getPerimeter() {
        return circumference;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Circle{" + "circumference=" + circumference + ", area=" + area + '}';
    }
}
