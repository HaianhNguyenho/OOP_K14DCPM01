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
        HangThucPham htp = (HangThucPham)objIn.readObject();
        HangThucPham htp2 = (HangThucPham)objIn.readObject();
        
        System.out.println(htp);
        System.out.println(htp2);
        objIn.close();


        
    }
    
}
