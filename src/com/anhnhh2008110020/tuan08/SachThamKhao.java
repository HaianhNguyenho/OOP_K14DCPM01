package com.anhnhh2008110020.tuan08;

public class SachThamKhao extends Sach {
    private double thue;
    private double thanhTien;

    public SachThamKhao(){
        super();
    }
    public SachThamKhao(double thue){
        super();
        this.thue = thue;
    }

    public double getThue(){
        return thue;
    }
    public void setThue(double thue){
        this.thue = thue;
    }
    public void nhapTTSach(){
        super.nhapTTSach();
        System.out.print("Nhap thue: ");
        thue = varInput.nextDouble();
    }
    @Override
    public String toString() {
        return super.toString()+" Thue"+this.thue;
    }
    
}
