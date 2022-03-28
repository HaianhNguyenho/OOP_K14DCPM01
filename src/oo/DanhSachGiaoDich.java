package oo;

import java.util.ArrayList;
import java.util.List;

public class DanhSachGiaoDich {
    private List<GiaoDich> danhSach = new ArrayList<>();

    private int soLuongGiaoDichDat;
    private int soLuongGiaoDichNha;

    public int getSoLuongGiaoDichDat(){
        return soLuongGiaoDichDat;
    }
    public int getSoluongGiaoDichNha(){
        return soLuongGiaoDichNha;
    }
    public void them(GiaoDich giaoDich){
        danhSach.add(giaoDich);
    }

    public void inDanhSach(){
        for (GiaoDich giaoDich : danhSach) {
            System.out.println(giaoDich);
        }
    }

    public void tinhTongSLTungLoai(){
        for (GiaoDich giaoDich : danhSach) {
            if(giaoDich instanceof GiaoDichDat){
                this.soLuongGiaoDichDat++;
            }else{
                this.soLuongGiaoDichNha++;
            }
            
        }
    }
    public double tinhTongTBGDat(){
        double tienGDDat = 0.0;
        int dem = 0;
        for (GiaoDich giaoDich : danhSach) {
            if (giaoDich instanceof GiaoDichDat){
            dem++;
            tienGDDat += giaoDich.tinhTien();
            }
        }
        return tienGDDat/dem;
    }
    public GiaoDich timKiemGiaoDich(String maGiaoDich){
        GiaoDich giaoDich = null;
        for (GiaoDich gd : danhSach) {
            if(gd.getMaGiaoDich().equalsIgnoreCase(maGiaoDich)&& gd instanceof GiaoDichDat){
                giaoDich = (GiaoDichDat) gd;
            }
            
        }
        return giaoDich;

    }
    public void xoaGiaoDich(GiaoDich giaoDich){
        this.danhSach.remove(giaoDich);
    }
    //tim vi tri cua GiaoDich trong danh sach
    public int timViTriCuaGD(GiaoDich giaoDich){
        int viTri = -1;
        viTri = this.danhSach.indexOf(giaoDich);
        return viTri;
    }
    public void suaGiaoDich(int viTri, GiaoDich giaoDich){
        this.danhSach.set(viTri, giaoDich);
    }
    
    
}
