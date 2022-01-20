package com.anhnhh2008110020.tuan03;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog kiki = new Dog();
        kiki.size = 7;
        Dog kaka = new Dog();
        kaka.size = 12;

        System.out.println("Chó kiki: ");
        kiki.bark();
        kiki.getBigger();
        kiki.run();
        System.out.println("Chó kaka: ");
        kaka.bark();
        kaka.getBigger();
        kaka.run();
    }
    
}
