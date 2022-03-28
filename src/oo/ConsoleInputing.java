package oo;

import java.util.Date;
import java.util.Scanner;



public class ConsoleInputing {
    private Scanner nhap = new Scanner(System.in);

    public Scanner getNhap(){
        return nhap;
    }

    public GiaoDich nhapGiaoDich(){
        GiaoDich giaoDich = null;
        System.out.println("Nhap ma giao dich: ");
        String maGiaoDich = nhap.nextLine();
        System.out.println("Don gia: ");
        double donGia = nhap.nextDouble();

        System.out.println("Ban chon loai nao 1-GiaoDichNha, 2-GiaoDichDat: ");
        int loai = nhap.nextInt();
        nhap.nextLine();

        if(loai == 1){
            System.out.print("Nhap dia chi: ");
            String diaChi = nhap.nextLine();
            giaoDich = new GisoDichNha(maGiaoDich, new Date(), donGia, 0, "Thuong", diaChi);

        }else{
            System.out.print("Nhap loai dat: ");
            char loaiDat = nhap.nextLine().charAt(0);

            giaoDich = new GiaoDichDat(maGiaoDich, new Date(), donGia, 0, loaiDat);

        }
        return giaoDich;
    }
    
}
