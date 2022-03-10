package com.anhnhh2008110020.tuan06;

public class Vehicle {

    //attributes
    //interface
    private String tenChuXe;
    private String loaiXe;
    private int dungTichXylanh;
    private double triGia;
    private int soXe;

    public Vehicle(){ //constructor mac dinh

    }
    //constructor chua tham so
    public Vehicle(String tenChuXe, String loaiXe, int dungTichXylanh, double triGia, int soXe) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTichXylanh = dungTichXylanh;
        this.triGia = triGia;
        this.soXe = soXe;
    }
    //get and set
    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getDungTichXylanh() {
        return dungTichXylanh;
    }

    public void setDungTichXylanh(int dungTichXylanh) {
        this.dungTichXylanh = dungTichXylanh;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }

    public int getSoXe() {
        return soXe;
    }

    public void setSoXe(int soXe) {
        this.soXe = soXe;
    }

    public double tinhThueNop(){
        double thue;
        if(dungTichXylanh<100){
            thue = triGia*0.01;
        }
        else if(dungTichXylanh >= 100 && dungTichXylanh<=200){
            thue = triGia*0.03;
        }
        else{
            thue = triGia * 0.05;
        }
        return thue;
    }
    @Override
    public String toString() {
        return "Vehicle [dungTichXylanh=" + dungTichXylanh + ", loaiXe=" + loaiXe + ", soXe=" + soXe + ", tenChuXe="
                + tenChuXe + ", triGia=" + triGia + "]";
    }
    void inThongTin(){
        System.out.println("Ten chu xe: "+getTenChuXe());
        System.out.println("Loai xe: "+getLoaiXe());
        System.out.println("Dung tich Xilanh: "+getDungTichXylanh());
        System.out.println("Tri gia: "+getTriGia());
        System.out.println("So xe: "+getSoXe());
    }
    
    
}
