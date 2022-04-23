package oop;

import Figures.Figure;

import java.io.*;
import java.util.ArrayList;

public class Read_from_a_file {

    public Read_from_a_file() {
    }
    public ArrayList<Figure>  Read() {

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\oop\\File_with_figures.txt")))
        {
            ArrayList<Figure> figures = (ArrayList<Figure> ) ois.readObject();
            return figures;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }

    }
    public void Read_text(){
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\oop\\File_with_text.txt"))) {
            String s;
            System.out.println("Прочитанно из файла:");
            while ((s = bufferedReader.readLine()) != null) {
                System.out.println(s);
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
