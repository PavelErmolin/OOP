package Figures.Creators;

import Figures.Figure;
import Figures.Point;
import Figures.Polygon;

import java.util.ArrayList;

public class PoligonCreator implements iFigureCreater {

    @Override
    public Figure CreateFigure(ArrayList<Point> points) {
        return new Polygon(points);
    }
}
