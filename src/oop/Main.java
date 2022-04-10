package oop;

import Figures.Figure;
import Figures.Point;
import Figures.Rectangle;
import Figures.Treangle;

public class Main {

    public static void main(String[] args) {

        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 1);
        Point p3 = new Point(2, 2);
        Point p4 = new Point(1, 2);
        Rectangle r  = new Rectangle(p1,p2,p3,p4);
        Treangle t = new Treangle(p1,p2,p3);
        System.out.println(r);
        System.out.println(t);
        System.out.println("Периметр прямоугольника: "+r.getPerimeter());
        System.out.println("Периметр треугольника: "+t.getPerimeter());
        System.out.println("Площадь прямоугольника: "+r.getArea());
        System.out.println("Площадь треугольника: "+t.getArea());
        Figure f1 = new Treangle(p1,p2,p3);
        Figure f2 = new Rectangle(p1,p2,p3,p4);
    }
}
