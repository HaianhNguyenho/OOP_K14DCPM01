package oo;

import java.util.Date;



public class GisoDichNha extends GiaoDich{
    private String loaiNha; //Caocap, Thuong
    private String diaChi;

    public GisoDichNha(String maGiaoDich, Date ngayGiaoDich, double donGia, double dienTich, String loaiNha,
            String diaChi) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public double tinhTien(){
        double tien;
        if(this.loaiNha.equals("CaoCap")){
            tien = this.getDienTich()*this.getDonGia();
        }else{
            tien = this.getDienTich()*this.getDonGia()*0.5;
        }
        return tien;
    }

    @Override
    public String toString() {
        return "GisoDichNha [diaChi=" + diaChi + ", loaiNha=" + loaiNha + "]" +super.toString();
    }
    

    
    
}
