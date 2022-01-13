package oo;

import java.util.Scanner;

public class SinhVienGDU {
    String name;
    int code;
    String dateBirthday;
    String address;
    int age;

public SinhVienGDU(){}

public SinhVienGDU(String name, int code, String dateBirthday, String address, int age) {
    this.name = name;
    this.code = code;
    this.dateBirthday = dateBirthday;
    this.address = address;
    this.age = age;
}

public void InforSV(){
    Scanner varInput = new Scanner(System.in);
    System.out.print("Nhap ten sinh vien: ");
    name = varInput.nextLine();
    
    System.out.print("Nhap ma sinh vien: ");
    code = varInput.nextInt();

    System.out.print("Nhap ngay sinh sinh vien: ");
    dateBirthday = varInput.nextLine();
    varInput.nextLine();

    System.out.print("Nhap dia chi sinh vien: ");
    address = varInput.nextLine();
    
    System.out.print("Nhap tuoi sinh vien: ");
    age = varInput.nextInt();
}
public void show(){
    System.out.println("Thong tinh sinh vien: ");
    System.out.println("Ten sinh vien: "+name);
    System.out.println("MSSV: "+code);
    System.out.println("Ngay sinh sinh vien: "+dateBirthday);
    System.out.println("Dia chi sinh vien: "+address);
    System.out.println("Tuoi sinh vien: "+age);
}
    
}
