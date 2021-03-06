package com.anhnhh2008110020.tuan05;

import java.util.Scanner;

public class SanPham {

    //thuộc tính
  private String tenSanPham;
  private double donGia;//
  private double giamGia;

    // ham tao (constructor)

    public SanPham(String tenSanPham, double donGia, double giamGia) {
        this.tenSanPham = tenSanPham;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    
    public SanPham(String tenSanPham, double donGia){
        this.tenSanPham = tenSanPham;
        this.donGia = donGia;
        this.giamGia = 0;
    }
    
    //get-set
    public String getTenSP(){
        return this.tenSanPham;
    }

    public void setTenSP(String tenSanPham){
        this.tenSanPham = tenSanPham;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }


    private double getThueNhapKhau(){
        return donGia * 0.1;
    }

    public SanPham(){

    }
    //method

    public void xuatThongTin(){
        System.out.println("Product name: "+ tenSanPham);
        System.out.println("Product price: "+donGia);
        System.out.println("Discount price: "+giamGia);
        System.out.println("GDP: "+getThueNhapKhau());
    }

    public void nhapThongTin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product name: ");
        tenSanPham = scanner.nextLine();

        System.out.println("Enter product price: ");
        donGia = scanner.nextDouble();

        System.out.println("Enter discount: ");
        giamGia = scanner.nextDouble();
    }
    
}
