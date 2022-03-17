package com.anhnhh2008110020.tuan09;

import java.util.Scanner;

public class HoaDon {
 protected  int maHD, maPhong;
 protected String ngayHD, tenKH;
 protected double donGia, thanhTien;

 Scanner varInput = new Scanner(System.in);

 protected HoaDon(){
     this.maHD = 0;
     this.maPhong = 0;
     this.ngayHD = "";
     this.tenKH = "";
     this.donGia = 0;
 }

protected HoaDon(int maHD, int maPhong, String ngayHD, String tenKH, double donGia, double thanhTien) {
    this.maHD = maHD;
    this.maPhong = maPhong;
    this.ngayHD = ngayHD;
    this.tenKH = tenKH;
    this.donGia = donGia;
    this.thanhTien = thanhTien;
}

protected int getMaHD() {
    return maHD;
}

protected void setMaHD(int maHD) {
    this.maHD = maHD;
}

protected int getMaPhong() {
    return maPhong;
}

protected void setMaPhong(int maPhong) {
    this.maPhong = maPhong;
}

protected String getNgayHD() {
    return ngayHD;
}

protected void setNgayHD(String ngayHD) {
    this.ngayHD = ngayHD;
}

protected String getTenKH() {
    return tenKH;
}

protected void setTenKH(String tenKH) {
    this.tenKH = tenKH;
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
    System.out.print("Nhap ma HD:  ");
    maHD = varInput.nextInt();
    System.out.print("Nhap ma Phong: ");
    maPhong = varInput.nextInt();
    System.out.print("Ngay hoa Don");
    ngayHD = varInput.next();
    System.out.print("Ten khach hang: ");
    tenKH = varInput.next();
    System.out.print("Don Gia: ");
    donGia = varInput.nextDouble();


}

@Override
public String toString() {
    return "HoaDon [donGia=" + donGia + ", maHD=" + maHD + ", maPhong=" + maPhong + ", ngayHD=" + ngayHD + ", tenKH="
            + tenKH + "]";
}


 

    
}
