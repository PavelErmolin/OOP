package Figures.Creators;

import Figures.Circle;
import Figures.Figure;
import Figures.Point;

import java.util.ArrayList;

public class CircleCreator implements iFigureCreator  {

    @Override
    public Figure CreateFigure(ArrayList<Point> points) {
        return new Circle(points);
    }
}
