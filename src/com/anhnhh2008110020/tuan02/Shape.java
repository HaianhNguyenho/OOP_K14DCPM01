package com.anhnhh2008110020.tuan02;

public class Shape {

    String shape;

    public Shape(String newShape){
        shape = newShape;
    }

    //hành vi
    public void turn(){
        System.out.println("Xoay hinh 360 do: "+shape);
    }
    
}
