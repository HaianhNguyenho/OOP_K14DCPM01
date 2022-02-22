package com.anhnhh2008110020.tuan04;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Square square = new Square("spring.aif");
        square.rotate();
        square.playSound();

        Circle circle = new Circle("summer.aif");
        circle.rotate();
        circle.playSound();

        Triangle triangle =new Triangle("tiktik.aif");
        triangle.rotate();
        triangle.playSound();

        Amoeba amoeba = new Amoeba("amoeba.hif",2.5,3.6);
        amoeba.rotate();
        amoeba.playSound();

    }
    
}
