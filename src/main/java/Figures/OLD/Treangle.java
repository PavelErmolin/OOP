package Figures.OLD;

import Figures.Point;

public class Treangle {
    private Point p1;
    private Point p2;
    private Point p3;
    double a;
    double b;
    double c;

    public Treangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.a= Math.sqrt(Math.pow(p1.getX()-p2.getX(),2)+Math.pow(p1.getY()-p2.getY(),2));
        this.b= Math.sqrt(Math.pow(p2.getX()-p3.getX(),2)+Math.pow(p2.getY()-p3.getY(),2));
        this.c= Math.sqrt(Math.pow(p3.getX()-p1.getX(),2)+Math.pow(p3.getY()-p1.getY(),2));
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    @Override
    public String toString() {
        return "Treangle{" + "p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + '}';
    }
    public double getPerimeter() {
        return this.a+this.b+this.c;
    }
    public double getArea(){
        double p = this.getPerimeter()/2;
        return Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));
    }
}
