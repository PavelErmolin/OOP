package Figures;

import java.util.ArrayList;

public class Polygon extends Figure {
    private ArrayList<Double> sides;                        // Список сторон
    private double perimeter;
    private double area;
    public Polygon(ArrayList<Point> points) {
        super(points);
        this.sides = new ArrayList<>();
        setSides();
        setPerimeter();
        serArea();
    }
    public ArrayList<Point> getPoints() {
        return points;
    }
    @Override
    public String toString() {
        return "Polygon {" + "points=" + points + '}';
    }

    private void setSides() {
        int i;
        for (i = 0; i < points.size() - 1; i++)
            sides.add(i, Math.sqrt(Math.pow(points.get(i).getX() - points.get(i + 1).getX(), 2) + Math.pow(points.get(i).getY() - points.get(i + 1).getY(), 2)));
        sides.add(i, Math.sqrt(Math.pow(points.get(i).getX() - points.get(0).getX(), 2) + Math.pow(points.get(i).getY() - points.get(0).getY(), 2)));
    }

    private void setPerimeter(){
        this.perimeter = 0;
        for (int i = 0; i < this.sides.size(); i++)
            this.perimeter += this.sides.get(i);
    }
    @Override
    public double getPerimeter() {
        return perimeter;
    }

    private void serArea(){
        double p = this.perimeter / 2;
        double rez = p;
        for (int i = 0; i < sides.size(); i++)
            rez *= (p - sides.get(i));
        this.area = Math.sqrt(rez);
    }

    @Override
    public double getArea(){
        return  this.area;
    }
}
