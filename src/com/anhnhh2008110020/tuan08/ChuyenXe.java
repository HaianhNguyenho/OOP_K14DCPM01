package com.anhnhh2008110020.tuan08;

import java.util.Scanner;

public class ChuyenXe {
    protected String maSoChuyen, tenTaiXe, soXe;
    protected double doanhThu;
    Scanner varInput = new Scanner(System.in);

   public ChuyenXe(){
       super();
       this.maSoChuyen = "";
       this.tenTaiXe = "";
       this.soXe = "";
       this.doanhThu = 0;
   }

public ChuyenXe(String maSoChuyen, String tenTaiXe, String soXe, double doanhThu) {
    super();
    this.maSoChuyen = maSoChuyen;
    this.tenTaiXe = tenTaiXe;
    this.soXe = soXe;
    this.doanhThu = doanhThu;
    }

public String getMaSoChuyen() {
    return maSoChuyen;
}

public void setMaSoChuyen(String maSoChuyen) {
    this.maSoChuyen = maSoChuyen;
}

public String getTenTaiXe() {
    return tenTaiXe;
}

public void setTenTaiXe(String tenTaiXe) {
    this.tenTaiXe = tenTaiXe;
}

public String getSoXe() {
    return soXe;
}

public void setSoXe(String soXe) {
    this.soXe = soXe;
}

public double getDoanhThu() {
    return doanhThu;
}

public void setDoanhThu(double doanhThu) {
    this.doanhThu = doanhThu;
}    

public void nhapTTChuyenXe(){
    System.out.print("Nhap ma so chuyen: ");
    maSoChuyen = varInput.nextLine();
    System.out.print("Nhap ho ten so chuyen: ");
    tenTaiXe = varInput.nextLine();
    System.out.print("Nhap so xe: ");
    soXe = varInput.nextLine();
    System.out.print("Nhap doanh thu: ");
    doanhThu = varInput.nextDouble();

}

public String toString(){
    return "Ma so chuyen: " +this.maSoChuyen + "Ten tai xe: "+this.tenTaiXe + "So xe: "+this.soXe+"Doanh thu: "+this.doanhThu;
}



   
    
}
