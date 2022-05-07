package Figures;

import Figures.Trasform.ITransformable;
import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.ArrayList;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property="Тип фигуры")
@JsonSubTypes({
        @JsonSubTypes.Type(value=Polygon.class, name="Многоугольник"),
        @JsonSubTypes.Type(value=Circle.class, name="Круг")
})

@JsonAutoDetect
public abstract class Figure implements Serializable, ITransformable {
    @JsonProperty("Точки")
    protected ArrayList<Point> points;
    @JsonIgnore
    protected double perimeter;
    @JsonIgnore
    protected double area;

    public Figure(){
    }
    public Figure(ArrayList<Point> points) {
        this.points = points;
    }

    public abstract String toString();

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea(){
        return area;
    }
    @JsonIgnore
    public abstract Point getCenter();

}
