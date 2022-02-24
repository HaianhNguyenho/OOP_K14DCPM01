package com.anhnhh2008110020.tuan05;

public class SanPhamTestDrive {
    public static void main(String[] args) {
        SanPham sanPham1 = new SanPham("Banh quy", 6000, 1000);
        SanPham sanPham2 = new SanPham("Su Kem", 20000);
        sanPham1.xuatThongTin();
        sanPham2.xuatThongTin();
    }
    
}
