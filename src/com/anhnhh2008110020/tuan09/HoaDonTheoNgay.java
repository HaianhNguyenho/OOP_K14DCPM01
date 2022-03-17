package com.anhnhh2008110020.tuan09;

public class HoaDonTheoNgay extends HoaDon {
   private int loaiTP, soNgayThue;

   public HoaDonTheoNgay(){
       super();
       this.loaiTP = 0;
       this.soNgayThue =0 ;
   }

public HoaDonTheoNgay(int maHD, int maPhong, String ngayHD, String tenKH, double donGia, double thanhTien, int loaiTP,
        int soNgayThue) {
    super(maHD, maPhong, ngayHD, tenKH, donGia, thanhTien);
    this.soNgayThue = soNgayThue;
    this.loaiTP =loaiTP;
}

public int getSoNgayThue() {
    return soNgayThue;
}

public void setSoNgayThue(int soNgayThue) {
    this.soNgayThue = soNgayThue;
}
   public void nhap(){
       super.nhap();
       System.out.println("So ngay thue: ");
       soNgayThue = varInput.nextInt();
   }
   public double TTien(){
    if(soNgayThue>7)
    return this.thanhTien = this.soNgayThue*donGia*0.2;
    else
    return this.thanhTien = this.soNgayThue;

   }
   public String toString(){
       String temp;
       if(loaiTP == 1)
       temp = "Sinh vien";
       else if(loaiTP == 2)
       temp = "Nhan vien";
       else
       temp = "Hoc vien";

       return "Hoa Don Theo Ngay: "+super.toString()+ ", Loai thue phong: " +temp + ", So ngay thue: " + soNgayThue + ",Thanh tien: "+thanhTien+ "]";
   }
   
    
}
