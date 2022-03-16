package com.anhnhh2008110020.tuan08;

import java.util.Scanner;

public class Sach {
    //atribute
    private String maSach;
    private String nhaXuatBan;
    private double donGia;
    private int soLuong;
   
    //mac dinh
    public Sach(){
        super();
    }
    //tham so
    public Sach(String maSach, String nhaXuatBan, double donGia, int soLuong) {
        super();
        this.maSach = maSach;
        this.nhaXuatBan = nhaXuatBan;
        this.donGia = donGia;
        soLuong = soLuong;
    }
    public String getMaSach() {
        return maSach;
    }
    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }
    public String getNhaXuatBan() {
        return nhaXuatBan;
    }
    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        soLuong = soLuong;
    }
    Scanner varInput = new Scanner(System.in);
    public void nhapTTSach(){
        System.out.print("Nhap ma sach: ");
        maSach = varInput.nextLine();
        System.out.print("Nhap ten nha xuat ban: ");
        nhaXuatBan = varInput.nextLine();
        System.out.print("Nhap don gia: ");
        donGia = varInput.nextDouble();
        System.out.print("Nhap so luong: ");
        soLuong = varInput.nextInt();
    }
    @Override
    public String toString() {
        return "Sach [SoLuong=" + this.soLuong + ", donGia=" +this.donGia + ", maSach=" +this.maSach + ", nhaXuatBan=" +this.nhaXuatBan
                + "]";
    }
    
    
}
