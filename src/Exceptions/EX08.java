package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class EX08 {
    public static void main(String [] args){

        // FileNotFoundException
        try{
            File file = new File("C://file.txt");

            FileReader fr = new FileReader(file);
        }
        catch (FileNotFoundException e){
            System.out.println("File doesn't exist.");
            e.printStackTrace();
        }
    }
}
