package com.anhnhh2008110020.tuan05;

public class Amoeba {
    private String soundFile;
    private double xPoint;
    private double yPoint;
    
    public Amoeba(){
        
    }
    
    public String getSoundFile() {
        return soundFile;
    }

    public void setSoundFile(String soundFile) {
        this.soundFile = soundFile;
    }

    public double getxPoint() {
        return xPoint;
    }

    public void setxPoint(double xPoint) {
        this.xPoint = xPoint;
    }

    public double getyPoint() {
        return yPoint;
    }

    public void setyPoint(double yPoint) {
        this.yPoint = yPoint;
    }

    void rotate(){
        System.out.println("Rotating 360 ..."+this.xPoint +" " +this.yPoint);
   }
   void playSound(){
       System.out.println("Play file "+this.soundFile+"music");
   }
    
}
