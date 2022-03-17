package com.anhnhh2008110020.kiemtragiaky;

import java.util.Scanner;

public class GiaoDich {
    protected String maGD, ngayGD;
    protected double donGia;
    protected float dienTich;

    Scanner varInput = new Scanner(System.in);

    protected GiaoDich(){
        super();
        this.maGD = "";
        this.ngayGD = "";
        this.donGia = 0;
        this.dienTich = 0;
    }

    protected GiaoDich(String maGD, String ngayGD, double donGia, float dienTich) {
        this.maGD = maGD;
        this.ngayGD = ngayGD;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    protected String getMaGD() {
        return maGD;
    }

    protected void setMaGD(String maGD) {
        this.maGD = maGD;
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

    protected float getDienTich() {
        return dienTich;
    }

    protected void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }
    protected void nhapTT(){
        System.out.print("Ma giao dich: ");
        maGD = varInput.next();
        System.out.print("Ngay giao dich: ");
        ngayGD = varInput.next();
        System.out.print("Don gia: ");
        donGia = varInput.nextDouble();
        System.out.print("Dien tich: ");
        dienTich = varInput.nextFloat();
    }

    @Override
    public String toString() {
        return "GiaoDich [dienTich=" + dienTich + ", donGia=" + donGia + ", maGD=" + maGD + ", ngayGD=" + ngayGD + "]";
    }
    

    
}
