package oo;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class HangThucPham {
    private String maHang;
    private String tenHang;
    private double donGia;
    private Date ngaySX;
    private Date ngayHetHan;

    private void setMaHang(String maHang){
        if(maHang != null){
            this.maHang = maHang;
        }else{
            System.out.println("Ma hang khong duoc rong");
            this.maHang = "000000";
        }
    }
    public String getMaHang(){
        return maHang;
    }
    public HangThucPham(String maHang){
        this.setMaHang(maHang);
    }
    public void setTenHang(String tenHang){
        //code rang buoc
        if(tenHang != null){
            this.tenHang = tenHang;
        }else{
            System.out.println("Ten Hang ko duoc rong");
            this.tenHang = "XXXXXXX";
        }
    }
    public void setDonGia(double donGia){
        if(donGia > 0){
            this.donGia = donGia;
        }else{
            System.out.println("Don gia > 0");
        }
    }
    public void setNgaySX(Date ngaySX){
        this.ngaySX =ngaySX;
    }
    public void setNgayHetHan(Date ngayHetHan){
        if(ngayHetHan != null){
            if(ngayHetHan.after(this.ngaySX)){
                this.ngayHetHan = ngayHetHan;
            }else{
                System.out.println("Ngay Het Han phai sau ngay san xuat!!!");
                this.ngayHetHan = new Date();
            }
        }else{
            System.out.println("Ngay het han khong duoc rong");
            this.ngayHetHan = new Date();
        }
       
    }
    @Override
    public String toString() {
        //dd//MM/yyyy: 10/03/2022
        SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/MM/yyyy");
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat tienVietNam = NumberFormat.getCurrencyInstance(localeVN);
        return "HangThucPham [donGia=" + tienVietNam.format(donGia) + ", maHang=" + maHang + ", ngayHetHan=" + tienVietNam.format(ngayHetHan) + ", ngaySX="
                + tienVietNam.format(ngaySX) + ", tenHang=" + tenHang + "]";
    }
    public HangThucPham(String maHang, String tenHang, double donGia, Date ngaySX, Date ngayHetHan){
        this.setMaHang(maHang);
        this.setTenHang(tenHang);
        this.setDonGia(donGia);
        this.setNgaySX(ngaySX);
        this.setNgayHetHan(ngayHetHan);
    }
    public boolean kiemTraHSD(){
        boolean isHetHan = false; // con han

        if(this.ngayHetHan.before(new Date())){
            isHetHan = true;
        }
        return isHetHan;
    }
}
