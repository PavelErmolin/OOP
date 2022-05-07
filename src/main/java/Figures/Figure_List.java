package Figures;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
@JsonAutoDetect
public class Figure_List {
    @JsonProperty("Список фигур")
    public ArrayList<Figure> figures;

    public Figure_List(ArrayList<Figure> figures) {
        this.figures = figures;
    }
    public Figure_List() {
    }
    @Override
    public String toString() {
        return "Figure_List{" +
                "figures=" + figures +
                '}';
    }
}
