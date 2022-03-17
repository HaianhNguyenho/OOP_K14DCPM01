package com.anhnhh2008110020.tuan08;

import java.util.ArrayList;
import java.util.Scanner;

public class ChuyenXeTestDrive {
    
    public static void main(String[] args) {
        ArrayList<ChuyenXeNoiThanh> arrNoiT = new ArrayList<>();
        ArrayList<ChuyenXeNgoaiThanh> arrNgoaiT = new ArrayList<>();
        int noiThanh, ngoaiThanh;
        double tienNoiThanh = 0 , tienNgoaiThanh = 0;

        Scanner varInput = new Scanner(System.in);
        System.out.print("Nhap so chuyen xe noi thanh: ");
        noiThanh =varInput.nextInt();
        System.out.print("Nhap so chuyen xe ngoai thanh: ");
        ngoaiThanh = varInput.nextInt();

        System.out.println("Nhap thong tin chuyen xe noi thanh: ");
        for(int i= 0 ; i < noiThanh; i++){
            System.out.println("Nhap thong tin chuyen xe thu " + (i+1)+": ");
            ChuyenXeNoiThanh chuyenXeNoiThanh = new ChuyenXeNoiThanh();
            chuyenXeNoiThanh.nhapTTChuyenXe();
            tienNoiThanh += chuyenXeNoiThanh.getDoanhThu();
            arrNoiT.add(chuyenXeNoiThanh);
        }
        System.out.println("Nhap thong tin chuyen xe ngoai thanh: ");
        for(int i =0; i<ngoaiThanh; i++){
            System.out.println("Nhap thong tin chuyen xe thu "+(i+1)+":");
            ChuyenXeNgoaiThanh chuyenXeNgoaiThanh = new ChuyenXeNgoaiThanh();
            chuyenXeNgoaiThanh.nhapTTChuyenXe();
            tienNgoaiThanh += chuyenXeNgoaiThanh.getDoanhThu();
            arrNgoaiT.add(chuyenXeNgoaiThanh);
        }

        System.out.println("------Thong tin chuyen xe noi thanh-----");
        for(int i = 0; i<arrNoiT.size(); i++){
            System.out.println(arrNoiT.get(i).toString());
        }
        System.out.println("----Thong tin chuyen xe ngoai thanh------");
        for(int i=0; i<arrNgoaiT.size(); i++){
            System.out.println(arrNgoaiT.get(i).toString());
        }
        System.out.println("Doanh thu tung chuyen xe: ");
        System.out.println("Doanh thu chuyen xe noi thanh: "+tienNoiThanh);
        System.out.println("Doanh thu chuyen xe ngoai thanh: "+tienNgoaiThanh);
        
    }
}
