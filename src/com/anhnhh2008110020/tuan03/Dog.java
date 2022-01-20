package com.anhnhh2008110020.tuan03;

public class Dog {
    int size;
    String bread;
    String name;

    void bark(){
        if(size > 14){
            System.out.println("Buff! buff!");
        }else{
            System.out.println("Wroff! wroff");
        }
    }
    void getBigger(){
        size +=5;
        
    }
    void run(){
        System.out.println("Running ...");
        this.bark();
    }
}
