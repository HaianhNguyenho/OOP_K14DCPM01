package oo;

import java.util.Date;

public class GiaoDichDat extends GiaoDich {
    private char loaiDat;//A,B,C

    

    //getter
    //setter

    public GiaoDichDat(String maGiaoDich, Date ngayGiaoDich, double donGia, double dienTich, char loaiDat) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiDat = loaiDat;
    }



    public double tinhTien(){
        double tien;
        if(this.loaiDat == 'C' && this.loaiDat == 'B'){
            tien = this.getDienTich()*this.getDienTich();
        }else{
            tien = this.getDienTich()*this.getDonGia()*1.5;
        }
        return tien;
    }



    @Override
    public String toString() {
        return "GiaoDichDat [loaiDat=" + loaiDat + "]"+super.toString();
    }
    
    
}
