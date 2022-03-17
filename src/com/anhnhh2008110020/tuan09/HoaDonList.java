package com.anhnhh2008110020.tuan09;


public class HoaDonList {
    private HoaDon hd[] = new HoaDon[100];
    private int countTP, sum1=0, sum2=0, dem =0 , sumTien = 0;

    public HoaDonList(){
        countTP = 0;
        for(int i= 0; i<100; i++){
            hd[i] = new HoaDon();
        }
    }
    public void themTP(int temp){
        if(countTP>100){
            System.out.println("Bo nho day. Khong the Them");

        }else{
            if(temp == 1){
                hd[countTP] = new HoaDonTheoNgay();
                HoaDonTheoNgay hoaDonTheoNgay = new HoaDonTheoNgay();
                hoaDonTheoNgay.nhap();
                hoaDonTheoNgay.thanhTien =hoaDonTheoNgay.TTien();
                hd[countTP] = hoaDonTheoNgay;
                sum1 += hoaDonTheoNgay.maPhong;

            }else{
                hd[countTP] = new HoaDonTheoGio();
                HoaDonTheoGio hoaDonTheoGio = new HoaDonTheoGio();
                hoaDonTheoGio.nhap();
                hoaDonTheoGio.thanhTien = hoaDonTheoGio.TTien();
                hd[countTP] =  hoaDonTheoGio;
                sumTien += hoaDonTheoGio . thanhTien;
                dem ++;

            }
            countTP++;
        }
        
    }
    public void hienThiHD(){
        for(int i = 0; i<countTP; i++){
            System.out.println("\n So "+(i+1));
            System.out.println(hd[i].toString());
        }
    }
    public void LuongHD(){
        System.out.println("===> Tong so luong hoa don theo gio:  "+sum1);
        System.out.println("===> Tong so luong hoa don theo ngay: "+sum2);

    }
    public void TrungBinh(){
        System.out.println("=====> Trung binh cua hoa don theo gio "+(sumTien/dem));
    }


   
    
}
