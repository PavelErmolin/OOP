package Figures;

import Figures.Trasform.ITransformable;

import java.util.ArrayList;

public class Circle extends Figure implements ITransformable {
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
        return "\nВывод круга: " + this.points.get(0).toString() + ", radius=" + this.radius + '}' +
                "\nДлинна окружности: "+this.getPerimeter() +
                "\nПлощадь круга: "+this.getArea() +
                "\n----------------------------------------------";
    }

    @Override
    public void Rotate(int degrees) {

    }

    @Override
    public void Scale(int x) {

    }

    @Override
    public void Transfer(int x,int y) {

    }
}
