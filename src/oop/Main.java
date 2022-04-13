package oop;

import Figures.Creators.FigureCreator;
import Figures.Figure;
import Figures.Point;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 1);
        Point p3 = new Point(2, 2);
        Point p4 = new Point(1, 2);
        ArrayList<Point> points = new ArrayList<>();
        points.add(p1);
        points.add(p2);
        points.add(p3);
        points.add(p4);
/*        Rectangle r  = new Rectangle(p1,p2,p3,p4);
        Treangle t = new Treangle(p1,p2,p3);
        System.out.println(r);
        System.out.println(t);
        System.out.println("Периметр прямоугольника: "+r.getPerimeter());
        System.out.println("Периметр треугольника: "+t.getPerimeter());
        System.out.println("Площадь прямоугольника: "+r.getArea());
        System.out.println("Площадь треугольника: "+t.getArea());
        Figure f3 = new Polygon(points);
        System.out.println("Выпод полигона: "+f3.toString());
        System.out.println("Периметр полигона: "+f3.getPerimeter());
        System.out.println("Площадь полигона: "+f3.getArea());
        */
        FigureCreator figureCreator = new FigureCreator();
        Figure figure = figureCreator.Create(points);
        System.out.println("Выпод полигона: "+figure.toString());
        System.out.println("Периметр полигона: "+figure.getPerimeter());
        System.out.println("Площадь полигона: "+figure.getArea());
    }
}
