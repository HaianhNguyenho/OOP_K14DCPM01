package com.anhnhh2008110020.tuan09;

import java.util.Scanner;

public class GiaoDich {
    protected int maGD, soLuong;
    protected String ngayGD;
    protected double donGia, thanhTien;
    Scanner varInput = new Scanner(System.in);

    protected GiaoDich(){
        this.maGD = 0;
        this.soLuong = 0;
        this.ngayGD = "";
        this.donGia = 0;
        this.thanhTien = 0;
    }

    protected GiaoDich(int ma, int so, String ngay, double don, double thanh) {
        this.maGD = ma;
        this.soLuong = so;
        this.ngayGD = ngay;
        this.donGia = don;
        this.thanhTien = thanh;
    }

    protected int getMaGD() {
        return maGD;
    }

    protected void setMaGD(int maGD) {
        this.maGD = maGD;
    }

    protected int getSoLuong() {
        return soLuong;
    }

    protected void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    protected String getNgayGD() {
        return ngayGD;
    }

    protected void setNgayGD(String ngayGD) {
        this.ngayGD = ngayGD;
    }

    protected double getDonGia() {
        return donGia;
    }

    protected void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    protected double getThanhTien() {
        return thanhTien;
    }

    protected void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }
    protected void nhap(){
        System.out.println("Ma giao dich: ");
        maGD = varInput.nextInt();
        System.out.println("Ngay giao dich: ");
        ngayGD =varInput.next();
        System.out.println("Don gia: ");
        donGia = varInput.nextDouble();
        System.out.println("So luong: ");
        soLuong = varInput.nextInt();
    }

    @Override
    public String toString() {
        return "GiaoDich [donGia=" + donGia + ", maGD=" + maGD + ", ngayGD=" + ngayGD + ", soLuong=" + soLuong + "]";
    }
    
    
}
