package oo;

import java.util.Date;




public class Main {
    public static void main(String[] args) {
        GiaoDichDat giaoDichDat = new GiaoDichDat("GDP01", new Date(), 500, 700, 'A');

        GiaoDichDat giaoDichDat2 = new GiaoDichDat("GDP02", new Date(), 200, 700, 'B');

        GisoDichNha gisoDichNha = new GisoDichNha("GDP01", new Date(), 1_000_000_000, 500, "Caocap","Quan 1" );

        DanhSachGiaoDich danhSachGiaoDich = new DanhSachGiaoDich();
        danhSachGiaoDich.them(giaoDichDat);
        danhSachGiaoDich.them(gisoDichNha);
        danhSachGiaoDich.them(giaoDichDat2);

        System.out.println("Dat: "+danhSachGiaoDich.getSoLuongGiaoDichDat());
        System.out.println("Tong GD dat "+danhSachGiaoDich.tinhTongTBGDat());
    }
    
}
