package oo;

public class Amoeba extends Shape {

    //toa do diem
    private double xPoint;
    private double yPoint;

    public void setxPoint(double xPoint) {
        this.xPoint = xPoint;
    }
    public void setyPoint(double yPoint) {
        this.yPoint = yPoint;
    }
  //  public Amoeba(String soundFile){
     //   this.soundFile = soundFile;
    //}
  //  public Amoeba(String soundFile, double xPoint, double yPoint){
      //  this(soundFile);
       // this.xPoint = xPoint;
      //  this.yPoint = yPoint;
   // }
    @Override
    void rotate(){
        System.out.println("Rotating 360 at xPoint: "+this.xPoint+" iyPoint: "+this.yPoint);
        this.playSound();
        
    }
    @Override
    void playSound(){
        //code xu ly cho file.hif
        System.out.println("Play file.hif"+this.getSoundFile()+"music");
    }
}
