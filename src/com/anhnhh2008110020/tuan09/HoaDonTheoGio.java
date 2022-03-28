package com.anhnhh2008110020.tuan09;

public class HoaDonTheoGio extends HoaDon {
    private int soGioThue;

    public HoaDonTheoGio(){
        super();
        this.soGioThue = 0;
    }

    public HoaDonTheoGio(int maHD, int maPhong, String ngayHD, String tenKH, double donGia, double thanhTien,
            int soGioThue) {
        super(maHD, maPhong, ngayHD, tenKH, donGia, thanhTien);
        this.soGioThue = soGioThue;
    }

    public int getSoGioThue() {
        return soGioThue;
    }

    public void setSoGioThue(int soGioThue) {
        this.soGioThue = soGioThue;
    }

    public void nhap(){
        super.nhap();
        System.out.println("So ngay thue: ");
        soGioThue = varInput.nextInt();

    }

    public double TTien(){
        if(soGioThue<24 && soGioThue<30)
        return this.thanhTien = this.soGioThue*this.donGia;
        else
        return this.thanhTien;
        
    }

    @Override
    public String toString() {
        return "So Gio Thue: " + super.toString() + ", soGioThue: "+ soGioThue+ ", Thanh tien "+thanhTien+"]";
    }

  
    
    
}
