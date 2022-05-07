package Figures.Creators;

import Figures.Figure;
import Figures.Point;

import java.util.ArrayList;

public interface iFigureCreator {
    public Figure CreateFigure(ArrayList<Point> points);
    }

