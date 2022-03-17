package com.anhnhh2008110020.kiemtragiaky;

public class GiaoDichDat extends GiaoDich {
    private String loaiDat;

    public GiaoDichDat(){
        super();
        this.loaiDat = "";
    }

    public GiaoDichDat(String maGD, String ngayGD, double donGia, float dienTich, String loaiDat) {
        super(maGD, ngayGD, donGia, dienTich);
        this.loaiDat = loaiDat;
    }

    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }
    public double TTien(){
        if(loaiDat == "A" && loaiDat == "B")
        return this.thanhTien = this.dienTich*this.donGia;
        else
        return this.thanhTien = this.dienTich*this.donGia*1.5;


    }

    public void nhapTT(){
        super.nhapTT();
        System.out.print("Chon dat (A, B, C): ");
        loaiDat = varInput.next();
    }

    @Override
    public String toString() {
        return super.toString() + "GiaoDichDat [loaiDat=" + loaiDat + "]";
    }
    
    
}
