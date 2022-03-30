package oo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class WrittingObjectList {
    public static void main(String[] args) throws IOException {
        FileOutputStream outFile = new FileOutputStream("data.dat");

        ObjectOutputStream objOut = new ObjectOutputStream(outFile);

        HangThucPham htp = new HangThucPham("HTP01", "Mi Hao Hao", 3_500, new Date(), new Date());

        HangThucPham htp2 = new HangThucPham("HTP02", "Mi Gau Do", 4_000 , new Date(), new Date());

        objOut.writeObject(htp);
        objOut.writeObject(htp2);
        System.out.println(htp);

        objOut.close();


    }
    
}
