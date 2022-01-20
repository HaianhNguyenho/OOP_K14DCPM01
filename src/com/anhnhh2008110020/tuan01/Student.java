package com.anhnhh2008110020.tuan01;

public class Student {
    //attribute-data-state
    boolean gioiTinh;
    float tuoi;
    String name;
    String khoa;
    double diemTB;

    //method - functions - bahavior
    //constructor
    public Student(){
        //code xử lý
        this.name="Haianh";
        this.tuoi = 20;
        this.gioiTinh = false;
        this.khoa = "CNTT";
        this.diemTB = 4.5;
    }
    public Student(String name, float tuoi){
        this.name = name;
        this.tuoi = tuoi;
    }
    public Student(boolean gioiTinh, float tuoi, String name, String khoa, double diemTB){
        this(name,tuoi); //goi ham tao 2 tham so dat dong dau tien
        this. diemTB = diemTB;
        this.khoa= khoa;
        this.gioiTinh = gioiTinh;
        this.hoc();
        this.thi();
    }
    void hoc(){
        System.out.println("Hoc ...");

    }
    void thi(){
        System.out.println("Thi...");
    }
    void dangKyMonHoc(){
        System.out.println();
    }
    
    void show(){
        System.out.println("Tên: "+name);
        System.out.println("Tuoi: "+tuoi);
        System.out.println("Gioi tinh: "+gioiTinh);
        System.out.println("Khoa: "+khoa);
        System.out.println("Diem Trung Binh: "+diemTB);
        
        }
    
    
}
