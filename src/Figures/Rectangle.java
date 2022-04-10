package Figures;

public class Rectangle extends Figure {
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;
    double a;
    double b;
    double c;
    double d;


    public Rectangle (Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.a = Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
        this.b = Math.sqrt(Math.pow(p2.getX() - p3.getX(), 2) + Math.pow(p2.getY() - p3.getY(), 2));
        this.c = Math.sqrt(Math.pow(p3.getX() - p4.getX(), 2) + Math.pow(p3.getY() - p4.getY(), 2));
        this.d = Math.sqrt(Math.pow(p4.getX() - p1.getX(), 2) + Math.pow(p4.getY() - p1.getY(), 2));
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

    public Point getP4() {
        return p4;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + ", p4=" + p4 + '}';
    }
    @Override
    public double getPerimeter() {
        return a + b + c + d;
    }
    @Override
    public double getArea(){
        double p = this.getPerimeter()/2;
        return Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c)*(p-this.d));
    }
}
