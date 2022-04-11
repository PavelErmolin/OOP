package Figures;

import java.util.ArrayList;

public abstract class Figure {
    protected ArrayList<Point> points;
    public Figure(ArrayList<Point> points){
        this.points=points;
    }
    public abstract String  toString();
    public abstract double getPerimeter();
    public abstract double   getArea();
}
