package oo;

import java.util.Date;

public abstract class GiaoDich {
    //lop cha truu tuong
    private String maGiaoDich;
    private Date ngayGiaoDich;
    private double donGia;
    private double dienTich;
    private static int count;

    //setter
    //getter
    public double getDonGia(){
        return donGia;
    }

    public double getDienTich(){
        return dienTich;
    }

    private void tangCount(){
        count++;
    }
    public abstract double tinhTien();

    

    public GiaoDich(){
        this.tangCount();
    }

    public GiaoDich(String maGiaoDich, Date ngayGiaoDich, double donGia, double dienTich) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    @Override
    public String toString() {
        return "GiaoDich [dienTich=" + dienTich + ", donGia=" + donGia + ", maGiaoDich=" + maGiaoDich
                + ", ngayGiaoDich=" + ngayGiaoDich + "]";
    }

    public String getMaGiaoDich(){
        return maGiaoDich;
    }
    public void setDonGia(double donGia){
        this.donGia = donGia;
    }
    public void setDienTich(double dienTich){
        this.dienTich = dienTich;
    }


   
    
}
