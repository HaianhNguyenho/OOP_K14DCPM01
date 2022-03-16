package com.anhnhh2008110020.tuan07;

public class Album {
    //attribute-data
    private int maCD;
    private String tuaCD;
    private String caSy;
    private int soBaiHat;
    private double giaThanh;

    //constructor mac dinh
    public Album(){

    }
    //constructoe co tham so

    public Album(int maCD, String tuaCD, String caSy, int soBaiHat, double giaThanh) {
        this.maCD = maCD;
        this.tuaCD = tuaCD;
        this.caSy = caSy;
        this.soBaiHat = soBaiHat;
        this.giaThanh = giaThanh;
    }
    // phuoc thuc set-get

    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }

    public String getTuaCD() {
        return tuaCD;
    }

    public void setTuaCD(String tuaCD) {
        this.tuaCD = tuaCD;
    }

    public String getCaSy() {
        return caSy;
    }

    public void setCaSy(String caSy) {
        this.caSy = caSy;
    }

    public int getSoBaiHat() {
        return soBaiHat;
    }

    public void setSoBaiHat(int soBaiHat) {
        this.soBaiHat = soBaiHat;
    }

    public double getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(double giaThanh) {
        this.giaThanh = giaThanh;
    }

    @Override
    public String toString() {
        return "Album [caSy=" + caSy + ", giaThanh=" + giaThanh + ", maCD=" + maCD + ", soBaiHat=" + soBaiHat
                + ", tuaCD=" + tuaCD + "]";
    }

    public void hienThiTTAlbum(){
        System.out.println("Ma CD: "+maCD);
        System.out.println("Ten CD: " +tuaCD);
        System.out.println("Ca Sy: "+caSy);
        System.out.println("So Bai Hat: "+soBaiHat);
        System.out.println("Gia Thanh: "+giaThanh);


    }
    

    
}
