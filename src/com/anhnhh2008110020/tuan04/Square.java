package com.anhnhh2008110020.tuan04;

public class Square {
    //attribute
    String soundFile;

    //method
    //constructor
    public Square(String soundFile){
        this.soundFile =soundFile;
    }

    void rotate(){
        System.out.println("Rotating 360 ...");
        this.playSound();

    }
    
    void playSound(){
        System.out.println("Play file music"+this.soundFile+"music");
    }
}
