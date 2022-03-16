package com.anhnhh2008110020.tuan07;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class ThucPham {
    //attribute - thuoc tinh
    private int maHang;
    private String tenHang;
    private double donGia;
    private Date ngaySX;
    private Date hanSD;

    //constructor mac dinh
    public ThucPham(){

    }
    //constructor co tham so

    public ThucPham(int maHang, String tenHang, double donGia, Date ngaySX, Date hanSD) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.ngaySX = ngaySX;
        this.hanSD = hanSD;
    }
    //phuong thuc set-get

    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public Date getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(Date ngaySX) {
        this.ngaySX = ngaySX;
    }

    public Date getHanSD() {
        return hanSD;
    }

    public void setHanSD(Date hanSD) {
        this.hanSD = hanSD;
    }
    // phuong thuc toString 
    public String toString(){
        //bien doi tien te VN
        Locale locale = new Locale("vi", "VN");
        NumberFormat tienVietNam = NumberFormat.getCurrencyInstance(locale);
        String str = tienVietNam.format(donGia);
        //bien doi ngay thang nam theo dang dd/mm/yyyy
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String str1 = simpleDateFormat.format(ngaySX);
        String str2 = simpleDateFormat.format(hanSD);
        return "Thong tin ve thuc pham: \n"+ "Ma hang: "+maHang +"\n Ten hang: "+tenHang+"\nDon gia"+ str +"\nNgay san xuat: "+str1+"\nHan su dung"+str2;
    }
    //Phuong thuc nhap nam thang ngay san xuat
    public void setNSX(int year, int month, int day){
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1, day);
        this.ngaySX = calendar.getTime();
    }
    //phuong thuc nhap han su dung
    public void setHSD(int year, int month, int day){
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1, day);
        this.hanSD = calendar.getTime();
    }
    //phuong thuc kt ten hang ko dc de trong
    public boolean kiemTraTeNhang(boolean v ){
        if(this.tenHang == "" || this.tenHang.isEmpty()){
            System.out.println("Ten hang ko dc de trong: ");
        }else{
            v=false;
        }
        return v;
    }
    //kiem tr ngay het han ko dc nho hon ngay san xuat
    public boolean kiemTraNgay(boolean y){
        if(this.getNgaySX().compareTo(this.getHanSD())<0){
            y =false;
        }
        return y;
    }

    //Kien tr han su dung cua san pham het han
    public void kiemTraHSD(){
        Date today = new Date();
        today.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String s = simpleDateFormat.format(today);
        if(this.getHanSD().compareTo(today)<0){
            System.out.println("Hom nay la ngay" +s + "=> hang hoa da het han ");

        }else{
            System.out.println("Hom nay la ngay " +s+ "=> hang hoa con han ");
        }
    }

    
}
