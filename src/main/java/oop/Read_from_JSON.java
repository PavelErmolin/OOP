package oop;

import Figures.Figure;
import Figures.Figure_List;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.FileReader;

public class Read_from_JSON {

    public Read_from_JSON() {
    }
    public Figure_List Read() {

        try(BufferedReader br = new BufferedReader (new FileReader("C:\\Users\\Павел\\IdeaProjects\\OOP\\src\\main\\java\\oop\\File_with_figures_list.JSON")))
        {
            String jsonString = br.readLine();
            System.out.println("Считанная строка: " + jsonString);
            ObjectMapper mapper = new ObjectMapper();
            Figure_List figure_list = mapper.readValue(jsonString, Figure_List.class);
            return figure_list;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }}

        public Figure Read_Figure() {
            try(BufferedReader br = new BufferedReader (new FileReader("C:\\Users\\Павел\\IdeaProjects\\OOP\\src\\main\\java\\oop\\File_with_figures.JSON")))
            {
                String jsonString = br.readLine();
                System.out.println("Считанная строка: " + jsonString);
                ObjectMapper mapper = new ObjectMapper();
                Figure figure = mapper.readValue(jsonString, Figure.class);
                return figure;
            }
            catch(Exception ex){
                System.out.println(ex.getMessage());
                return null;
            }
    } //рудимент
}
