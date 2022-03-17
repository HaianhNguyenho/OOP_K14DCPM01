package com.anhnhh2008110020.kiemtragiaky;

public class GiaoDichList {
    private GiaoDich gd[] = new GiaoDich[100];
    private int countGD , sum1 = 0, sum2 =0, dem = 0, sumTien = 0;

    public GiaoDichList(){
        countGD = 0;
        for(int i =0; i<100; i++){
            gd[i] = new GiaoDich();
        }
    }
    public void ThemGD(int temp){
        if(countGD>100){
            System.out.println("Bo nho day");
        }else{
            if(temp ==1){
                gd[countGD] = new GiaoDichDat();
                GiaoDichDat giaoDichDat = new GiaoDichDat();
                giaoDichDat.nhapTT();
                giaoDichDat.thanhTien = giaoDichDat.TTien();
                gd[countGD] = giaoDichDat;
                sum1+=giaoDichDat.soLuong;
            }
            else{
                gd[countGD] = new GiaoDichNha();
                GiaoDichNha giaoDichNha = new GiaoDichNha();
                giaoDichNha.nhapTT();
                giaoDichNha.thanhTien = giaoDichNha.TTien();
                gd[countGD] = giaoDichNha;
                sum2 += giaoDichNha.thanhTien;
                sumTien += giaoDichNha.thanhTien;
                dem++;
            }
            countGD++;
        }
    }
    public void hienthiGD(){
        for(int i=0; i<countGD; i++){
            System.out.print("So thu tu giao dich: "+(i+1));
            System.out.println(gd[i].toString());
        }
    }
    public void Tong(){
        System.out.print("Tong so luong giao dich dat: "+sum1);
        System.out.print("Tong so luong giao dich nha: "+sum2);
    }
    public void TB(){
        System.out.print("Trung binh tien cua giao dich dat: "+(sumTien/dem));
    }
}
