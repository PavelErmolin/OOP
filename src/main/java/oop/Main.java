package oop;

import Figures.Creators.FigureCreator;
import Figures.Figure;
import Figures.Figure_List;
import Figures.Point;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Начало блока создания фигур
        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 1);
        Point p3 = new Point(2, 2);
        Point p4 = new Point(1, 2);
        ArrayList<Point> four_points = new ArrayList<>();
        four_points.add(p1);
        four_points.add(p2);
        four_points.add(p3);
        four_points.add(p4);
        Point p5 = new Point(1, 1);
        Point p6 = new Point(2, 2);
        ArrayList<Point> two_points = new ArrayList<>();
        two_points.add(p5);
        two_points.add(p6);
        FigureCreator figureCreator = new FigureCreator();
        Figure four_points_figure = figureCreator.Create(four_points);
        Figure two_points_figure = figureCreator.Create(two_points);
        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(four_points_figure);
        figures.add(two_points_figure);
        Figure_List figure_list = new Figure_List(figures);
        System.out.println(figure_list);
        // Конец блока создания фигур
        // Начало блока записи и чтения из файла
        /*
        Save_in_file save_in_file= new Save_in_file();
        save_in_file.Save(figures);
        Read_from_a_file read_from_a_file = new Read_from_a_file();
        ArrayList<Figure> new_figures = read_from_a_file.Read();
        System.out.println(new_figures);
        */
        // Конец блока записи и чтения из файла
        // Начало блока записи и чтения из JSON

        Save_in_JSON save_in_json = new Save_in_JSON();
        save_in_json.Serialization(figure_list);
        Read_from_JSON read_from_json = new Read_from_JSON();
        Figure_List figure_list_new = read_from_json.Read();
        System.out.println(figure_list_new);
        /*
        Save_in_JSON save_in_json = new Save_in_JSON();
        save_in_json.Serialization(four_points_figure);
        Read_from_JSON read_from_json = new Read_from_JSON();
        Figure figure_new = read_from_json.Read_Figure();
        System.out.println(figure_new);
        */

        // Конец блока записи и чтения из JSON
    }
}
