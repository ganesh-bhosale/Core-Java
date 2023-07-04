package Exceptions.throwsEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class EX13 {
    public static void main(String [] args) throws FileNotFoundException{
        String path = "c://test.xlsx";
        FileInputStream file = new FileInputStream(path);
    }
}
