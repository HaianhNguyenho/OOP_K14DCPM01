package oo;

public class Shape {
    //attribute
    //implementation

    private String soundFile; //Xuan-Ha-Thu-Dong 

    public void setSoundFile(String soundFile) {
        this.soundFile = soundFile;
    }

    public String getSoundFile(){
        return soundFile;
    }

    //method
    public Shape(){}

    public Shape(String SoundFile){
        this.soundFile = soundFile;
    }

    /**default */ void rotate(){
        System.out.println("Rotaing 360...");
        this.playSound();
    }
    void playSound(){
        System.out.println("Play file .aif "+this.soundFile+"music");
    }
    
}
