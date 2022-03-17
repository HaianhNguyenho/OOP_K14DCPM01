package oo;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class WrittingObject {
    public static void main(String[] args) throws IOException{
        //1.
        FileOutputStream outFile = new FileOutputStream("data.dat");

        //2.
        ObjectOutputStream objout = new ObjectOutputStream(outFile);

        //HangThucPham
        HangThucPham htp = new HangThucPham("TP01", "Hao Hao", 3.500, new Date(), new Date());
        
        objout.writeObject(htp);

        System.out.println(htp);
        objout.close();

    }
    
}
