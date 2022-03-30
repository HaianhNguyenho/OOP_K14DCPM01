package oo;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class WritingObject {
    public static void main(String[] args) throws IOException {
        //1.tao file
        FileOutputStream outFile = new FileOutputStream("data.dat");
        //tao doi tuong
        ObjectOutputStream objOut = new ObjectOutputStream(outFile);
        //ghi doi tuong
        
       //hangThucPham
       HangThucPham htp = new HangThucPham("HTP01", "Mi Hao Hao", 3_500, new Date(), new Date());

       HangThucPham htp2 = new HangThucPham("HTP02", "Mi Gau Do", 4_000, new Date(), new Date());

       //code vs abstract
       List<HangThucPham> list = new ArrayList<>();
       list.add(htp);
       list.add(htp2);

       objOut.writeObject(list);

       System.out.println(htp);

       objOut.close();
    }
    
}
