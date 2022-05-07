package Figures;

import Figures.Trasform.ITransformable;
import com.fasterxml.jackson.annotation.*;

import java.util.ArrayList;

public class Circle extends Figure implements ITransformable {
    @JsonIgnore
    private Double radius;                              //радиус
    @JsonCreator
    public Circle(@JsonProperty("Точки") ArrayList<Point> points) {
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

    @Override
    public Point getCenter() {
        return points.get(0);
    }

    public void setArea() {
        this.area = Math.PI * this.radius * this.radius;
    }

    @Override
    public String toString() {
        return "\nВывод круга: центр круга: (" +this.points.get(0).getX()+ ":"+this.points.get(0).getY()+")"+
                 ", radius=" + this.radius + '}' +
                "\nДлинна окружности: "+this.getPerimeter() +
                "\nПлощадь круга: "+this.getArea() +
                "\n----------------------------------------------";
    }

    @Override
    public void Rotate(int degrees) {

    } //Ha ha ha

    @Override
    public void Scale(double x) {
        x=Math.sqrt(x);
        ArrayList<Point> new_points = new ArrayList<>();
        new_points.add(0,this.points.get(0));
        new_points.add(1, new Point((this.points.get(1).getX() - this.points.get(0).getX()) * x + this.points.get(0).getX(), (this.points.get(1).getY() - this.points.get(0).getY()) * x + this.points.get(0).getY()));
        this.points = new_points;
        this.setRadius();
        this.setPerimeter();
        this.setArea();
    }

    @Override
    public void Transfer(int x,int y) {
        ArrayList<Point> new_points = new ArrayList<>();
        new_points.add(0,new Point (this.points.get(0).getX()+x,this.points.get(0).getY()+y));
        new_points.add(1,new Point (this.points.get(1).getX()+x,this.points.get(1).getY()+y));
        this.points = new_points;
    }
}
