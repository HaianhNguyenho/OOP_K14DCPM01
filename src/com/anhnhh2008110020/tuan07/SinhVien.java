package com.anhnhh2008110020.tuan07;

public class SinhVien {
    private int maSinhVien;
    private String hoTen;
    private String diaChi;
    private String sDT;

    //constructor mac dinh
    public SinhVien(){}
    //constructor co tham so

    public SinhVien(int maSinhVien, String hoTen, String diaChi, String sDT) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sDT = sDT;
    }
    //phuong thuc get-set

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getsDT() {
        return sDT;
    }

    public void setsDT(String sDT) {
        this.sDT = sDT;
    }

    @Override
    public String toString() {
        return "SinhVien [diaChi=" + diaChi + ", hoTen=" + hoTen + ", maSinhVien=" + maSinhVien + ", sDT=" + sDT + "]";
    }
  public void hienThiTT(){
      System.out.println("Ma SV: "+maSinhVien);
      System.out.println("Ho ten: "+hoTen);
      System.out.println("Dia chi: "+diaChi);
      System.out.println("So dien thoai "+sDT);
  }
    
}
