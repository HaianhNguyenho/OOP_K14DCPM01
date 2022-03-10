package com.anhnhh2008110020.tuan06;

import java.util.Scanner;

public class VehicleTestDrive {
 static Scanner varInput = new Scanner(System.in);

    public static void nhapThongTin(Vehicle motorbike){
        System.out.println("Nhap ten chu xe: ");
        motorbike.setTenChuXe(varInput.nextLine());
        System.out.println("Nhap loai xe: ");
        motorbike.setLoaiXe(varInput.nextLine());
        System.out.println("Nhap dung tich: ");
        motorbike.setDungTichXylanh(varInput.nextInt());
        System.out.println("Nhap tri gia: ");
        motorbike.setTriGia(varInput.nextDouble());
        System.out.println("Nhap so xe: ");
        motorbike.setSoXe(varInput.nextInt());
    }
    public static void main(String[] args) {
        Vehicle vehicle[] = null;
        int a, b =0;
        boolean khoiLenh = true;
        do{
            System.out.println("=========MENU==============");
            System.out.println(">>1. Nhap thong tin va cac doi tuong xe1, xe2, xe3" );
            System.out.println(">>2. Xuat bang ke khai tien thue truoc ba cua cac xe");
            System.out.println(">>3. Thoat");
            System.out.printf("Nhap lua chon: ");
            a = varInput.nextInt();
            switch(a){
                case 1:
                System.out.printf("Nhap so luong xe de khai bao thue: ");
                b=varInput.nextInt();
            //khai bao mang v[] de chua so luong xe
            vehicle = new Vehicle[b];

            for(int i = 0; i<b; i++){
                System.out.printf("Cac doi tuong xe: ");
                vehicle[i] = new Vehicle();
                nhapThongTin(vehicle[i]);
                }
        
            break;
        case 2:
                System.out.print("Xuat bang thong ke tien thue ");
                for(int i = 0; i<b; i++ ){
                    vehicle[i].inThongTin();
                }
                break;
                default:
                System.out.println("Thoat");
                khoiLenh = false;
                break;

            }
        }while (khoiLenh);
    
    } 
}  
