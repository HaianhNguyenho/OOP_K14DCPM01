package oo;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setSoundFile("circle.aif");
        circle.rotate();
        circle.playSound();

        Amoeba amoeba = new Amoeba();
        amoeba.setxPoint(5);
        amoeba.setyPoint(10);
        amoeba.setSoundFile("amoeba.aif");
        amoeba.rotate();
        amoeba.playSound();
    }
    
}
