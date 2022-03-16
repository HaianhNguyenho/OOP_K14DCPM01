package com.anhnhh2008110020.tuan07;

import java.util.Scanner;

public class AlbumTestDrive {
   
    static Scanner varInput = new Scanner(System.in);
    static void nhapAlbum(Album album){
        System.out.print("Nhap ma CD: ");
        album.setMaCD(varInput.nextInt());
        varInput.nextLine();
        System.out.print("Nhap tua CD: ");
        album.setTuaCD(varInput.nextLine());
        System.out.print("Nhap ten ca sy: ");
        album.setCaSy(varInput.nextLine());
        System.out.println("Nhap so luong bai hat: ");
        album.setSoBaiHat(varInput.nextInt());
        System.out.print("Nhap gia thanh: ");
        album.setGiaThanh(varInput.nextDouble());
    }
    public static void main(String[] args) {
        Album al[] = null;
        int a,b=0;
        boolean khoiLenh = true;
        do{
            System.out.println(">>1.Nhap thong tin CD ");
            System.out.println(">>2.Xuat danh sach Album ");
            System.out.println(">>3.Tinh tong gia thanh ");
            System.out.println(">>4.Tong so luong CD ");
            System.out.println(">>5. sap xep giam dan theo gia thanh ");
            System.out.println(">>6. Sap xep tang dan theo tua CD ");
            System.out.print("Nhap lua chon: ");
            a = varInput.nextInt();
            switch(a){
                case 1:
                System.out.println("Nhap so luong CD: ");
                b = varInput.nextInt();
                al = new Album[b];
                for(int i = 0; i<b; i++){
                    System.out.println("CD thu "+(i+1)+": ");
                    al[i] = new Album();
                    nhapAlbum(al[i]);
                }
                break;
                case 2:
                System.out.println("Xuat danh sach thong tin Album");
                System.out.println("MA CD: ");
                System.out.println("Tua CD: ");
                System.out.println("Ten ca sy: ");
                System.out.println("So bai hat: ");
                System.out.println("Gia thanh: ");
                for(int i= 0 ; i<b; i++){
                    al[i].hienThiTTAlbum();
                }
                break;
                case 3:
                int tong = 0;
                for(int i =0; i<b; i++){
                    tong += al[i].getGiaThanh();
                }
                System.out.println("Tong gia thanh la: "+tong);
                break;
                case 4:
                System.out.println("Tong so luong CD la: "+b);
                break;
                case 5:
                Album temp = al[0];
                for(int i = 0 ; i<b-1; i++){
                    for(int j= i+1; j<b; j++){
                        if(al[i].getGiaThanh() < al[j].getGiaThanh()){
                            temp = al[j];
                            al[j] = al[i];
                            al[i] = temp;
                        }
                    }
                }
                System.out.println("Sap xep thanh cong. Nhap so 2 kiem tra ");
                break;
                case 6:
                temp = al[0];
                for(int i = 0 ; i<b; i++){
                    for(int j = i+1; j<b; j++){
                        if(al[i].getTuaCD().compareTo(al[j].getTuaCD())>0){
                            temp = al[j];
                            al[j]= al[i];
                            al[i]= temp;
                        }
                    }
                }
                System.out.println("Sap xep thanh cong.Nhap so 2 kiem tra!!");
                break;
                default:
                System.out.println("Thoat");
                khoiLenh = false;
                break;
            }

        }while(khoiLenh);
    }
}
