package Figures;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.io.Serializable;
@JsonAutoDetect
public class Point implements Serializable {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public  Point(double x,double y){
        this.x=x;
        this.y=y;
    }

    public  Point(){
    }
    public String toString(){
        return "Point: ("+getX()+ ":"+getY()+")";
    }
}
