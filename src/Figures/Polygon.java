package Figures;

import Figures.Trasform.ITransformable;

import java.util.ArrayList;

public class Polygon extends Figure implements ITransformable {
    private ArrayList<Double> sides;                        // Список сторон

    public Polygon(ArrayList<Point> points) {
        super(points);
        this.sides = new ArrayList<>();
        setSides();
        setPerimeter();
        serArea();
    }           // Конструктор
    public ArrayList<Point> getPoints() {
        return points;
    }
    @Override
    public String toString() {
        return "\nВывод полигона: " + this.points +
                "\nПериметр полигона: " + this.getPerimeter() +
                "\nПлощадь полигона: " + this.getArea() +
                "\n----------------------------------------------";
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

    private void serArea(){
        double p = this.perimeter / 2;
        double rez = p;
        for (int i = 0; i < sides.size(); i++)
            rez *= (p - sides.get(i));
        this.area = Math.sqrt(rez);
    }

    @Override
    public void Rotate(int degrees) {

    }

    @Override
    public void Scale(int x) {

    }

    @Override
    public void Transfer(int x, int y) {

    }
}
