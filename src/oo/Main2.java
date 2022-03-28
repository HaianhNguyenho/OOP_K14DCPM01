package oo;

import java.util.Date;
import java.util.Scanner;





public class Main2 {
    public static void main(String[] args) {
        Scanner varInput = new Scanner(System.in);
        DanhSachGiaoDich danhSachGiaoDich = new DanhSachGiaoDich();

        System.out.println("Nhap ma giao dich>>");
        String maGiaoDich = varInput.nextLine();
        System.out.println("Don gia");
        double donGia = varInput.nextDouble();
        varInput.nextLine();

        System.out.print("Giao Dich Dat_1/Nha_2");
        int loai = varInput.nextInt();

        GiaoDich giaoDich;

        if(loai == 1){
            giaoDich = new GiaoDichDat(maGiaoDich, new Date(), donGia, 500, 'B');
        }else{
            giaoDich = new GisoDichNha(maGiaoDich, new Date(), donGia, 200, "Thuong", "Binh vhanh");

        }
        danhSachGiaoDich.them(giaoDich);
        danhSachGiaoDich.inDanhSach();
    }
    
}
