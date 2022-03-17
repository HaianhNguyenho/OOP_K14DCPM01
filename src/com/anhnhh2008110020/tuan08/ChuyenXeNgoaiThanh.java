package com.anhnhh2008110020.tuan08;

public class ChuyenXeNgoaiThanh extends ChuyenXe{
    private  String noiDen;
    private int soNgayDiDuoc;

    public ChuyenXeNgoaiThanh(){
        super();
        this.noiDen = "";
        this.soNgayDiDuoc = 0;
    }

    public ChuyenXeNgoaiThanh(String noiDen, int soNgayDiDuoc){
        super();
        this.noiDen = noiDen;
        this.soNgayDiDuoc = 0;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }
  public void nhapTTChuyenXe(){
      super.nhapTTChuyenXe();
      System.out.print("Nhap noi den: ");
      noiDen = varInput.nextLine();
      System.out.print("Nhap ngay di duoc: ");
      soNgayDiDuoc = varInput.nextInt();
  }

  public String toString(){
      return super.toString() + ", Noi den: "+this.noiDen + "So ngay di duoc: "+ this.soNgayDiDuoc;
  }
}
