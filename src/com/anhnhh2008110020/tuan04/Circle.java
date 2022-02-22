package com.anhnhh2008110020.tuan04;

public class Circle {
    String soundFile;

    public Circle(String soundFile){
        this.soundFile = soundFile;
    }

    void rotate(){
        System.out.println("Rotating 360...");
    }

    void playSound(){
        System.out.println("Play file "+ this.soundFile+"music");
    }
    
}
