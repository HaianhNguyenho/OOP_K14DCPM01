package oo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ReadingObjectList {
    public static void main(String[] args) throws IOException, ClassNotFoundException{

        FileInputStream inFile = new FileInputStream("data.dat");

        ObjectInputStream objIn = new ObjectInputStream(inFile);

        List<HangThucPham> list = (List) objIn.readObject();

        for (HangThucPham hangThucPham : list) {
            if(hangThucPham.getTenHang().trim().equalsIgnoreCase("Mi Gau Do")){
                System.out.println(hangThucPham);
            }
        }
        objIn.close();
        
    }
    
}
