package phanmemxoayhinh;

public class Triangle {
    String soundFile;

    Triangle(String soundFile){
        this.soundFile = soundFile;
    }
    void rotate(){
        System.out.println("Rotating 360.....");
    }
    void playSound(){
        System.out.println("Play file "+this.soundFile+"music");
    }
}
