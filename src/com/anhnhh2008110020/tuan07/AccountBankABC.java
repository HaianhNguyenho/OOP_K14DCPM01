package com.anhnhh2008110020.tuan07;

import java.text.NumberFormat;
import java.util.Scanner;

public class AccountBankABC {
    //attribute-data
    private long soTaiKhoan;
    private String tenTaiKhoan;
    private double soTienTaiKhoan;

    //constructor mac dinh
    public AccountBankABC(){

    }
    //constructor chua tham so

    public AccountBankABC(long soTaiKhoan, String tenTaiKhoan, double soTienTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.soTienTaiKhoan = soTienTaiKhoan;
    }
    //Phuong thuc set and get

    public long getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(long soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public double getSoTienTaiKhoan() {
        return soTienTaiKhoan;
    }

    public void setSoTienTaiKhoan(double soTienTaiKhoan) {
        this.soTienTaiKhoan = soTienTaiKhoan;
    }
    //PHUONG THUC toString hien thi kq dang chuoi
    @Override
    public String toString() {
        NumberFormat monney = NumberFormat.getCurrencyInstance();
        String str = monney.format(soTienTaiKhoan);
        return "AccountBankABC [soTaiKhoan=" + soTaiKhoan + ", soTienTaiKhoan=" + soTienTaiKhoan + ", tenTaiKhoan="
                + tenTaiKhoan + "]";
    }

    //method
    
    Scanner varInput = new Scanner(System.in);
    public double napTien(){
        double soTienCanNap;
        System.out.println("Nhap so tien can nap: ");
        soTienCanNap = varInput.nextDouble();
        //so tien can nap lon hon 0
        if (soTienCanNap>0){
            soTienTaiKhoan = soTienCanNap + soTienTaiKhoan;
            NumberFormat money = NumberFormat.getCurrencyInstance();
            String str = money.format(soTienCanNap);
            System.out.println("Ban da nap so tien la: "+str);
        }
        else{
            System.out.println("Ban nap so tien ko hop le. Vui long thu lai sau ");
        }

        return soTienCanNap;
    }
    public double rutTien(){
        double phiRutTien = 20000;
        double soTienCanRut;
        System.out.println("Nhap so tien can rut: ");
        soTienCanRut = varInput.nextDouble();
        if(soTienCanRut <= (soTienTaiKhoan - phiRutTien )){
            soTienTaiKhoan = soTienTaiKhoan - (phiRutTien + soTienCanRut);
            NumberFormat money = NumberFormat.getCurrencyInstance();
            String str =  money.format(soTienCanRut);
            System.out.println("Ban da rut so tien la: "+str);
        }  
        else{
            System.out.println("Ban rut so tien ko hop le. Vui long thu lai sau ");
            return rutTien();
        }

        return soTienCanRut;
        
    }
    public double daoHan(){
        double hangSoLaiXuat = 0.035;
        soTienTaiKhoan = soTienTaiKhoan + soTienTaiKhoan * hangSoLaiXuat;
        NumberFormat money = NumberFormat.getCurrencyInstance();
        String str = money.format(soTienTaiKhoan);
        System.out.println("Ban vua dao han voi so tien la: ");
        return soTienTaiKhoan;
    }
    public void inThongTinTK(){
        NumberFormat money = NumberFormat.getCurrencyInstance();
        String str = money.format(soTienTaiKhoan);
        System.out.printf("So Tai khoan ", soTaiKhoan);
        System.out.printf("Ten tai khoan", tenTaiKhoan);
        System.out.printf("Da chuyen tien tai khoan: ",str);

    }
    
    
}
