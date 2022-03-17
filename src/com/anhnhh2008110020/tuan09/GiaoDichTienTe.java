package com.anhnhh2008110020.tuan09;

public class GiaoDichTienTe extends GiaoDich{
    private float tiGia;
    private int loaiTienTe;

    public GiaoDichTienTe(){
        super();
        this.tiGia = 0;
        this.loaiTienTe = 0;
    }

    public GiaoDichTienTe(int ma, int so, String ngay, double don, double thanh, float tiGia, int loaiTienTe) {
        super(ma, so, ngay, don, thanh);
        this.tiGia = tiGia;
        this.loaiTienTe = loaiTienTe;
    }

    public float getTiGia() {
        return tiGia;
    }

    public void setTiGia(float tiGia) {
        this.tiGia = tiGia;
    }

    public int getLoaiTienTe() {
        return loaiTienTe;
    }

    public void setLoaiTienTe(int loaiTienTe) {
        this.loaiTienTe = loaiTienTe;
    }

   public void nhap(){
       super.nhap();
       System.out.println("Ty gia: ");
       tiGia = varInput.nextFloat();
        System.out.println("Loai tien te: ");
        loaiTienTe = varInput.nextInt();
   }
   
   public double TTien(){
       if(loaiTienTe == 1)
           return this.thanhTien = this.donGia*this.soLuong;
       else
           return this.thanhTien = this.donGia*this.soLuong*this.tiGia;
       
   } 
   public String toString(){
       String temp;
       if(loaiTienTe == 1)
        temp = "VND";
        else if(loaiTienTe == 2)
        temp = "USD";
        else 
        temp = "EURO";
        return "Giao Dich Tien Te: "+ super.toString() + " Ti gia: " + tiGia+ ", Loai tien te: "+temp+", Thanh tien "+thanhTien+ "]";
   }
   
}
