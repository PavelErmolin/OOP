package Figures;

import Figures.Trasform.ITransformable;
import com.fasterxml.jackson.annotation.*;

import java.util.ArrayList;
import java.util.Comparator;

public class Polygon extends Figure implements ITransformable {
    @JsonIgnore
    private ArrayList<Double> sides;                        // Список сторон
    @JsonCreator
    public Polygon(@JsonProperty("Точки") ArrayList<Point> points) {
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

    @Override
    public Point getCenter() {
        double maxX = this.points.stream().max(Comparator.comparing(Point::getX)).get().getX();
        double minX = this.points.stream().min(Comparator.comparing(Point::getX)).get().getX();
        double maxY = this.points.stream().max(Comparator.comparing(Point::getY)).get().getY();
        double minY = this.points.stream().min(Comparator.comparing(Point::getY)).get().getY();
        return new Point((maxX+minX)/2,(maxY+minY)/2);
    }

    private void setSides() {
        int i;
        sides.clear();
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
        while(degrees<0) degrees+=360;
        while(degrees>360) degrees-=360;
        Point centerPoint = getCenter();
        System.out.println("Center: " + centerPoint );
        ArrayList<Point> new_points = new ArrayList<>();
        for (int i = 0; i < points.size(); i++) {
            new_points.add(i,new Point((this.points.get(i).getX()-centerPoint.getX())*Math.cos(Math.toRadians(degrees))-(this.points.get(i).getY()-centerPoint.getY())*Math.sin(Math.toRadians(degrees))+centerPoint.getX(),
                                       (this.points.get(i).getX()-centerPoint.getX())*Math.sin(Math.toRadians(degrees))+(this.points.get(i).getY()-centerPoint.getY())*Math.cos(Math.toRadians(degrees))+centerPoint.getY()));
            System.out.println(this.points.get(i) + "  "+ new_points.get(i));
        }
        this.points = new_points;
        setSides();
        setPerimeter();
        serArea();
    }

    @Override
    public void Scale(double x) {
        Point centerPoint = getCenter();
        System.out.println("Center: " + centerPoint );
        ArrayList<Point> new_points = new ArrayList<>();
        for (int i = 0; i < points.size(); i++) {
            new_points.add(i,new Point((this.points.get(i).getX()-centerPoint.getX())*x+centerPoint.getX(),(this.points.get(i).getY()-centerPoint.getY())*x+centerPoint.getY()));
            System.out.println(this.points.get(i) + "  "+ new_points.get(i));
        }
        this.points = new_points;
        setSides();
        setPerimeter();
        serArea();
    }

    @Override
    public void Transfer(int x, int y) {
        ArrayList<Point> new_points = new ArrayList<>();
        for (int i = 0; i < points.size(); i++) {
            new_points.add(i,new Point(this.points.get(i).getX()+x,this.points.get(i).getY()+y));
            System.out.println(this.points.get(i) + "  "+ new_points.get(i));
        }
        this.points = new_points;
        setSides();
        setPerimeter();
        serArea();
    }
}
