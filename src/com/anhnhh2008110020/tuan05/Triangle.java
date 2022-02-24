package com.anhnhh2008110020.tuan05;

public class Triangle {
  private String soundFile ;

    public Triangle(){
        
    }
    

    public String getSoundFile() {
        return soundFile;
    }


    public void setSoundFile(String soundFile) {
        this.soundFile = soundFile;
    }


    void rotate(){
        System.out.println("Rotating 360 ...");
    }

    void  playSound(){
        System.out.println("Play filec"+this.soundFile+"music");
    }
    
}
