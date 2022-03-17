package com.anhnhh2008110020.kiemtragiaky;

public class GiaoDichNha extends GiaoDich{
    private String diaChi;
    private int loaiNha;
    
    public GiaoDichNha(){
        super();
        this.loaiNha = 0;
        this.diaChi = "";
    }

    

    public GiaoDichNha(String maGD, String ngayGD, double donGia, float dienTich, int soLuong, String diaChi) {
        super(maGD, ngayGD, donGia, dienTich, soLuong);
        this.diaChi = diaChi;
    }



    public int getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(int loaiNha) {
        this.loaiNha = loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    public void nhapTT(){
        super.nhapTT();
        System.out.print("Nhap dia chi" );
        diaChi = varInput.next();
    }
    public double TTien(){
        if(loaiNha == 1)
        return this.thanhTien = this.dienTich*this.donGia;
        else
        return this.thanhTien = this.dienTich*this.donGia*0.9;

    }
    public String toString(){
        String temp;
        if(loaiNha ==1 )
        temp = "caoCap";
        else if(loaiNha == 2)
        temp = "Thuong";
        else
        temp = "Khong hop le";

        return "Giao Dich Nha: "+super.toString() + ", Loai nha: "+temp+", Dia chi: "+diaChi+"]";
    }
}
