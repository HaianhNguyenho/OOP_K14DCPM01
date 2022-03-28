package oo;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class WriitingObject {
    public static void main(String[] args) throws IOException {
        //1.tao file
        FileOutputStream outFile = new FileOutputStream("data.dat");
        //tao doi tuong
        ObjectOutputStream object = new ObjectOutputStream(outFile);
        //ghi doi tuong
        
        SinhVienGDU hp1 = new SinhVienGDU("H", 3, "992002", "KKK", 19);
        object.writeObject(hp1);
        System.out.println(hp1);
        object.close();
    }
    
}
