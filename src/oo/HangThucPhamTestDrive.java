package oo;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HangThucPhamTestDrive {
    public static void main(String[] args) throws ParseException{
        //HangThucPham htp = new HangThucPham();
        //System.out.println(htp);
        //khong chinh sua
        //co quyen truy cap
        //htp.setMaHang("TP09");

        //System.out.println(htp);

        //System.out.println("MH"+htp,getMaHang());

        //HangThucPham htp2 = new HangThucPham(null);
        //System.out.println(htp2);
        SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/MM/yyyy");

        String ngaySX = "13/03/2022";
        String ngayHetHan = "28/03/2022";

        HangThucPham htp3 =new HangThucPham("TP04","Mi Hao Hao", 2.500, ngayVietNam.parse(ngaySX), ngayVietNam.parse(ngayHetHan));

        System.out.println(htp3);

        if(htp3.kiemTraHSD()){
            System.out.println("Het han roi ! dung an");

        }else{
            System.out.println("Con han su dung an di");
        }
        System.out.println("Ngay hien tai: "+ new Date());
    }
    
}
