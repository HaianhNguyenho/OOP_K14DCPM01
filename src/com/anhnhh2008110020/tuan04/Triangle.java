package com.anhnhh2008110020.tuan04;

public class Triangle {
    String soundFile ;

    public Triangle(String soundFile){
        this.soundFile =soundFile;
    }

    void rotate(){
        System.out.println("Rotating 360 ...");
    }

    void  playSound(){
        System.out.println("Play filec"+this.soundFile+"music");
    }
    
}
