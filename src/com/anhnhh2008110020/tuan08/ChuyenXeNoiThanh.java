package com.anhnhh2008110020.tuan08;

import java.util.Scanner;

public class ChuyenXeNoiThanh extends ChuyenXe{

    private String soTuyen;
    private double soKmDiDuoc;
    Scanner varInput = new Scanner(System.in);

    public ChuyenXeNoiThanh(){
        super();
    }

    public ChuyenXeNoiThanh(String soTuyen, double soKmDiDuoc){
        super();
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }

    public double getSoKmDiDuoc() {
        return soKmDiDuoc;
    }

    public void setSoKmDiDuoc(double soKmDiDuoc) {
        this.soKmDiDuoc = soKmDiDuoc;
    }

    public String getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(String soTuyen) {
        this.soTuyen = soTuyen;
    }
    

    public Scanner getVarInput() {
        return varInput;
    }

    public void setVarInput(Scanner varInput) {
        this.varInput = varInput;
    }

    public void nhapTTChuyenXe(){
        super.nhapTTChuyenXe();
        System.out.print("Nhap so tuyen: ");
        soTuyen = varInput.nextLine();
        System.out.print("Nhap so km di duoc: ");
        soKmDiDuoc = varInput.nextDouble();

    }
    
    public String toString(){
        return super.toString() + " So tuyen: " + this.soTuyen + " So km di duoc: "+this.soKmDiDuoc;
    }
}
