package oop;

import Figures.Figure;
import Figures.Figure_List;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringWriter;

public class Save_in_JSON {
    StringWriter writer;
    ObjectMapper mapper;

    public Save_in_JSON() {
        this.writer = new StringWriter();
        this.mapper = new ObjectMapper();
    }

    public void Serialization (Figure_List figures){

        try(FileOutputStream fos =  new FileOutputStream("C:\\Users\\Павел\\IdeaProjects\\OOP\\src\\main\\java\\oop\\File_with_figures_list.JSON")) {
            mapper.writeValue(fos, figures);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void Serialization (Figure figure){

        try(FileOutputStream fos =  new FileOutputStream("C:\\Users\\Павел\\IdeaProjects\\OOP\\src\\main\\java\\oop\\File_with_figures.JSON")) {
            mapper.writeValue(fos, figure);
        } catch (IOException e) {
            e.printStackTrace();
        }

    } //рудимент

}
