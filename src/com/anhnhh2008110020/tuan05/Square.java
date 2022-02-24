package com.anhnhh2008110020.tuan05;

public class Square {
    //attribute
  private String soundFile;

    //method
    //constructor
    public Square(){
        
    }
    

    public String getSoundFile() {
        return soundFile;
    }


    public void setSoundFile(String soundFile) {
        this.soundFile = soundFile;
    }


    void rotate(){
        System.out.println("Rotating 360 ...");
        this.playSound();

    }
    
    void playSound(){
        System.out.println("Play file music"+this.soundFile+"music");
    }
    
}
