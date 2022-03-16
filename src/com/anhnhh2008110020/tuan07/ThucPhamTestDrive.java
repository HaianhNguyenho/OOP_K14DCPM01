package com.anhnhh2008110020.tuan07;

import java.util.Scanner;

public class ThucPhamTestDrive {
    public static void main(String[] args) {
        Scanner varInput = new Scanner(System.in);
        ThucPham tp = new ThucPham();
        boolean kt = true;
        boolean th = true;
        System.out.println("Nhap ma hang: ");
       
       
        tp.setMaHang(varInput.nextInt());
        varInput.nextLine();
        do{
            System.out.println("Nhap ten hang: ");
            tp.setTenHang(varInput.nextLine());

        }while(tp.kiemTraTeNhang(kt));
        System.out.println("Nhap don gia: ");
        tp.setDonGia(varInput.nextDouble());
        do{
            System.out.println("Nhap ngay, thang, nam san xuat: ");
            tp.setNSX(varInput.nextInt(), varInput.nextInt(), varInput.nextInt());
            System.out.println("Nhap ngay, thang, nam het hen: ");
            tp.setHSD(varInput.nextInt(), varInput.nextInt(), varInput.nextInt());
        } while(tp.kiemTraNgay(th));
        System.out.println(tp);
        tp.kiemTraHSD();
    }
    
}
