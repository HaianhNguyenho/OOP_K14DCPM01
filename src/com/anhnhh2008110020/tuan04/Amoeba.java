package com.anhnhh2008110020.tuan04;

public class Amoeba {
    String soundFile;
    double xPoint;
    double yPoint;
    
    public Amoeba(String soundFile, Double xPoint, Double yPoint){
        this.soundFile =soundFile;
        this.xPoint = xPoint;
        this.yPoint = yPoint;

    }
    void rotate(){
        System.out.println("Rotating 360 ..."+this.xPoint + this.yPoint);
   }
   void playSound(){
       System.out.println("Play file "+this.soundFile+"music");
   }
}
