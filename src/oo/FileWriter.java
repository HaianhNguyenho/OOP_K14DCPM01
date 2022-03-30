package oo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriter {
    
    public static void write(String fileName, String s){
        File file = new File(fileName);

        PrintWriter out = null;
        try{
            out = new PrintWriter(file);
            out.println(s);
            //out.close();
        }catch(FileNotFoundException e){
            System.out.println("File khong ton tai may oi !!!");
            e.printStackTrace();
            //out.close();
        }
        finally{
            System.out.println("Finally...");
            try{
                out.close();
            }catch(NullPointerException ex){
                System.out.println("Null ma dong cai gi!!!");
            }
        }
    }
    
}
