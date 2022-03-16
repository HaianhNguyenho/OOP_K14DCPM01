package com.anhnhh2008110020.tuan08;

public class SachGiaoKhoa extends Sach {
    private String tinhTrang;
    private int number;
    private double thanhTien;

    public SachGiaoKhoa(){

    }

  public SachGiaoKhoa(String tinhTrang, int number){
      super();
      this.tinhTrang=tinhTrang;
      this.number = number;
  }

  public String getTinhTrang(){
      return tinhTrang;
  }
  public void setTinhTrang(String tinhTrang){
        this.tinhTrang = tinhTrang;
  }
  public int getNumber(){
      return number;
  }
  public void setNumber(int number){
      this.number = number;
  }
   public String tinhTrangSach(int s){
       switch(number){
           case 0:
           tinhTrang = "old";
           break;
           case 2:
           tinhTrang = "new";
           break;
           default:
           break;
       }
       return tinhTrang;
   } 
   public void nhapTTSach(){
       super.nhapTTSach();
       System.out.print("Nhap tinh trang sach (0-cu/ 1- moi):");
       number =varInput.nextInt();
   }
   public String toString(){
       return super.toString() + " Tinh trang sach"+this.tinhTrangSach(number);
   }
    
}
