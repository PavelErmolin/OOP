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
        ArrayList<Point> four_points = new ArrayList<>();
        four_points.add(p1);
        four_points.add(p2);
        four_points.add(p3);
        four_points.add(p4);
        Point p5 = new Point(0, 0);
        Point p6 = new Point(0, 1);
        ArrayList<Point> two_points = new ArrayList<>();
        two_points.add(p5);
        two_points.add(p6);
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
        Figure four_points_figure = figureCreator.Create(four_points);
        Figure two_points_figure = figureCreator.Create(two_points);
        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(four_points_figure);
        figures.add(two_points_figure);
        System.out.println(figures);
        Save_in_file save_in_file= new Save_in_file();
        save_in_file.Save(figures);
        Read_from_a_file read_from_a_file = new Read_from_a_file();
        ArrayList<Figure> new_figures = read_from_a_file.Read();
        System.out.println(new_figures);

    }
}
