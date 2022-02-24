package oo;

public class Dog {
    //atrribute -data
  private  int size; //implementation
  /**default-mặc định */  String name; //interface
  /**default-mặc định */  String bread;

  //methods
  //interface
  public void setSize(int size){
      //viết code để ràng buộc size không bao giờ được âm
      if(size>0){
      this.size = size;
    }else{
      System.out.println("Size unvalid (khong hop le)!!");
  }
}
    //interface
  public int getSize(){
      return this.size;
  }
    
    
}
