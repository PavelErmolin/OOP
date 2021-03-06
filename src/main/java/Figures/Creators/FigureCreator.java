package Figures.Creators;

import Figures.Figure;
import Figures.Point;

import java.util.ArrayList;

public class FigureCreator {
    public Figure Create (ArrayList <Point> points){
        Figure figure = null;
        if(points.size()==2)
            figure = new CircleCreator().CreateFigure(points);
        else if (points.size()>2)
            figure = new PoligonCreator().CreateFigure(points);
        return figure;
    }
}
