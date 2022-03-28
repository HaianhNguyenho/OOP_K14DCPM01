package oo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadingObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException{

        //1
        FileInputStream inFile = new FileInputStream("data.dat");

        //2
        ObjectInputStream objIn = new ObjectInputStream(inFile);

        //3. Read Object
        HangThucPham hp1 = (HangThucPham)objIn.readObject();
        HangThucPham hp2 = (HangThucPham)objIn.readObject();
        System.out.println(hp1);
        System.out.println(hp2);
        objIn.close();


        
    }
    
}
