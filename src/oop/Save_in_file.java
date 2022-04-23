package oop;

import Figures.Figure;

import java.io.*;
import java.util.ArrayList;


public class Save_in_file  {
        FileWriter fileWriter;

        BufferedWriter bufferedWriter;

        public Save_in_file() {
        }
        public void Save(ArrayList<Figure> figures){

                try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\oop\\File_with_figures.txt")))
                {
                        oos.writeObject(figures);
                }
                catch(Exception ex){
                        System.out.println(ex.getMessage());
                }
        }

        public void Save_text(){
                try {
                        fileWriter = new FileWriter("src\\oop\\File_with_text.txt",true);
                        this.bufferedWriter = new BufferedWriter(fileWriter);
                        String text = "\ntest";
                        bufferedWriter.write(text);
                        System.out.println("File saved");
                        this.bufferedWriter.close();
                } catch (IOException e) {
                        System.out.println("ERROR");
                        e.printStackTrace();
                }
        }
}
