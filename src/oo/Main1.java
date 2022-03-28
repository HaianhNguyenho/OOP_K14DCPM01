package oo;



public class Main1 {
    public static void main(String[] args) {
        DanhSachGiaoDich danhSachGiaoDich = new DanhSachGiaoDich();
        String nhapTiep = null;

        ConsoleInputing ConsoleInputing= new ConsoleInputing();

        do{
            GiaoDich giaoDich = ConsoleInputing.nhapGiaoDich();
            danhSachGiaoDich.them(giaoDich);
            System.out.println("Ban muon nhap tiep khong? Y/N: ");
            nhapTiep = ConsoleInputing.getNhap().nextLine();
        }while(nhapTiep.equalsIgnoreCase("Y"));

        GiaoDich giaoDich = danhSachGiaoDich.timKiemGiaoDich("GDP01");

        danhSachGiaoDich.xoaGiaoDich(giaoDich);

        GiaoDich giaoDichSua = danhSachGiaoDich.timKiemGiaoDich("GDP01");

        int viTri = danhSachGiaoDich.timViTriCuaGD(giaoDichSua);

        giaoDich.setDonGia(450);
        giaoDich.setDienTich(1000);

        danhSachGiaoDich.suaGiaoDich(viTri, giaoDich);

    }
    
}
