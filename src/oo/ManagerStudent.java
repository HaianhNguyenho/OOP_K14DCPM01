package oo;



public class ManagerStudent {
  private  String name;
  private  double code;
  private  float diemLT;
  private float diemTH;

  //constructor
public ManagerStudent(){
    
}




public ManagerStudent(String name, double code, float diemLT, float diemTH) {
    this.name = name;
    this.code = code;
    this.diemLT = diemLT;
    this.diemTH = diemTH;
}


//methods

public String getName() {
    return name;
}



public void setName(String name) {
    this.name = name;
}



public double getCode() {
    return code;
}



public void setCode(double code) {
    this.code = code;
}



public float getDiemLT() {
    return diemLT;
}



public void setDiemLT(float diemLT) {
    this.diemLT = diemLT;
}



public float getDiemTH() {
    return diemTH;
}



public void setDiemTH(float diemTH) {
    this.diemTH = diemTH;
}

public double tinhDiemTB(){
    return (this.diemTH + this.diemLT)/2;
}

public String toString(){
    String string = "\tInforSV\n"+ "Name student: " + getName() + "\tCode student: " + getCode() + "\tScore LT: " + getDiemLT() + "\tScore TH: " + getDiemTH() + "\tAverage score: " + tinhDiemTB() + "\n";

    return string;
}




    
    
}
