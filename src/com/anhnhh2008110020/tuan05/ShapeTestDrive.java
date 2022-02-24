package com.anhnhh2008110020.tuan05;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Square square = new Square();
        square.setSoundFile("Spring.aif");
        square.rotate();
        square.playSound();

        Circle circle = new Circle();
        circle.setSoundFile("summer.aif");
        circle.rotate();
        circle.playSound();

        Triangle triangle =new Triangle();
        triangle.setSoundFile("tiktik.aif");
        triangle.rotate();
        triangle.playSound();

        Amoeba amoeba = new Amoeba();
        amoeba.setSoundFile("amoeba.aif");
        amoeba.setxPoint(3.5);
        
        amoeba.setyPoint(4.5);
        amoeba.rotate();
        amoeba.playSound();

    }
    
    
}
