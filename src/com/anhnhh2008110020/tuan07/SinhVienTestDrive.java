package com.anhnhh2008110020.tuan07;

import java.util.Scanner;

public class SinhVienTestDrive {
    static Scanner varInput = new Scanner(System.in);
    static void nhapThongTin(SinhVien sinhVien){
        System.out.println("Nhap ma sinh vien: ");
        sinhVien.setMaSinhVien(varInput.nextInt());
        varInput.nextLine();
        System.out.println("Nhap ho ten sinh vien: ");
        sinhVien.setHoTen(varInput.nextLine());
        System.out.println("dia chi Sinh vien: ");
        sinhVien.setDiaChi(varInput.nextLine());
        do{
            System.out.println("Nhap so dien thoai bao gom 7 chu so: ");
            sinhVien.setsDT(varInput.nextLine());
        }while(sinhVien.getsDT().length() != 7);
    }
    public static void main(String[] args) {
        SinhVien sv[] = null;
        int z,x = 0;
        boolean khoiLenh = true;
        do{
            System.out.println("===============MENU===============");
            System.out.println(">>1. Nhap thong tin sinh vien \n");
            System.out.println(">>2. Nhap ban danh sach sinh vien\n");
            System.out.println("Nhap lua chon: ");
            z=varInput.nextInt();
            switch(z){
                case 1:
                System.out.println("Nhap so luong sinh vien khai bao: ");
                x = varInput.nextInt();
                sv = new SinhVien[x];
                for(int i = 0; i<x; i++){
                    System.out.println("Sinh vien thu "+(i+1)+": ");
                    sv[i] = new SinhVien();
                    nhapThongTin(sv[i]);

                }
                break;
                case 2:
                SinhVien temp = sv[0];
                for(int i=0; i<sv.length -1; i++){
                    for(int j= i +1;  j<sv.length; j++){
                        if(sv[i].getMaSinhVien()>sv[j].getMaSinhVien()){
                            temp = sv[j];
                            sv[j] = sv[i];
                            sv[i] = temp;
                        }
                    }
                }
                System.out.println("Xuat thong tin sinh vien");
                System.out.println("MSSV: ");
                System.out.println("Ho va ten: ");
                System.out.println("Dia chi: ");
                System.out.println("So dien thoai: ");
                for(int i = 0; i<x; i++){
                    sv[i].hienThiTT();
 
                }
                break;
                default:
                System.out.println("Khong tim thay danh sach ");
                khoiLenh = false;
                break;
            }

        }while(khoiLenh);
    }
    
}
