package Figures;

import java.util.ArrayList;

public abstract class Figure {
    protected ArrayList<Point> points;
    protected double perimeter;
    protected double area;

    public Figure(ArrayList<Point> points) {
        this.points = points;
    }

    public abstract String toString();

    public double getPerimeter() {
        return perimeter;
    }
    public double getArea(){
        return area;
    }
}
