package com.anhnhh2008110020.tuan09;

public class GiaoDichVang extends GiaoDich {
    private String loaiVang;
    public GiaoDichVang(){
        super();
        this.loaiVang = "";
    }
    public GiaoDichVang(int ma, int so, String ngay, double don, double thanh, String loaiVang) {
        super(ma, so, ngay, don, thanh);
        this.loaiVang = loaiVang;
    }
    public String getLoaiVang() {
        return loaiVang;
    }
    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }

    public void nhap(){
        super.nhap();
        System.out.println("Loai Vang: ");
        loaiVang =varInput.nextLine();

    }
    public double TTien(){
        
        return this.thanhTien = this.donGia*this.soLuong;
    }
    @Override
    public String toString() {
        return "GiaoDichVang [loaiVang=" + loaiVang + ", thanhTien = " + thanhTien +" ]";
    }
    

    
}
