package Figures;

import java.util.ArrayList;

public class Circle extends Figure {
    private Double radius;                              //радиус

    public Circle(ArrayList<Point> points) {
        super(points);
        setRadius();
        setPerimeter();
        setArea();
    }        //конструктор

    private void setPerimeter() {
        this.perimeter = 2*Math.PI*this.radius;
    }
    private void setRadius() {
        this.radius = Math.sqrt(Math.pow(points.get(0).getX() - points.get(1).getX(), 2)+
                                Math.pow(points.get(0).getY() - points.get(1).getY(), 2)  );
    }
    @Override
    public double getPerimeter() {
        return perimeter;
    }

    public void setArea() {
        this.area = Math.PI * this.radius * this.radius;
    }

    @Override
    public String toString() {
        return "Circle center " + this.points.get(0).toString() + ", radius=" + this.radius + '}';
    }
}
