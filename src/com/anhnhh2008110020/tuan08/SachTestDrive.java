package com.anhnhh2008110020.tuan08;

import java.util.ArrayList;
import java.util.Scanner;

public class SachTestDrive {
    public static void main(String[] args) {
        ArrayList<SachGiaoKhoa> arrSGK = new ArrayList<>();
        ArrayList<SachThamKhao> arrSTK = new ArrayList<>();
        int soSGK, soSTK;
        double tienSGK = 0, tienSTK= 0, donGiaSachTK = 0, averageDonGia = 0;
        Scanner varInput = new Scanner(System.in);

        System.out.println("Nhap so sach giao khoa: ");
        soSGK = varInput.nextInt();
        System.out.println("Nhap so sach tham khao: ");
        soSTK = varInput.nextInt();

        System.out.println("Nhap TTSGK: ");
        for(int i=0; i<soSGK; i++){
            System.out.println("Nhap TT sach thu " +(i+1) +":");
            SachGiaoKhoa sachGiaoKhoa = new SachGiaoKhoa();
            sachGiaoKhoa.nhapTTSach();
            arrSGK.add(sachGiaoKhoa);
        }
        System.out.println("Nhap TTSTK: ");
        for(int i = 0 ; i<soSTK;i++){
            System.out.println("Nhap TT sach thu "+(i+1)+":");
            SachThamKhao sachThamKhao = new SachThamKhao();
            sachThamKhao.nhapTTSach();
            arrSTK.add(sachThamKhao);
        }

        for (int i=0; i<arrSGK.size(); i++){
            if(arrSGK.get(i).getNumber()==0){
                tienSGK += arrSGK.get(i).getSoLuong() * arrSGK.get(i).getDonGia()*50/100;
            }else if(arrSGK.get(i).getNumber()==1){
                tienSGK += arrSGK.get(i).getSoLuong() * arrSGK.get(i).getDonGia();
            }
        }
        System.out.print("Tong sach giao khoa = "+tienSGK);

        for(int i=0; i<arrSTK.size(); i++){
            tienSTK += arrSTK.get(i).getSoLuong() *arrSTK.get(i).getDonGia() + arrSTK.get(i).getThue();
        
        }
        System.out.println("Tong tien sach tham khao = " +tienSTK);

        System.out.println("Thong tin sach giao khoa");
        for(int i = 0; i<arrSGK.size(); i++){
            System.out.println(arrSTK.get(i).toString());
        }
        System.out.println("Thong tin sach tham khao ");
        for(int i = 0 ; i<arrSGK.size(); i++){
            System.out.println(arrSTK.get(i).toString());
        }
        System.out.println("Trung binh cong don gia cac sach tham khao: ");
        for(int i=0; i<arrSTK.size(); i++){
            donGiaSachTK += arrSTK.get(i).getDonGia();
            averageDonGia = donGiaSachTK / arrSTK.size();
        }
        System.out.println("Trung binh cong don gia STK: "+averageDonGia);

        System.out.println(" Cac sach giao khoa cua thu vien X");
        for(int i = 0; i<arrSGK.size(); i++){
            if(arrSGK.get(i).getNhaXuatBan().equalsIgnoreCase("X")){
                System.out.println(arrSGK.get(i).toString());
            }

        }
    }
    
}
