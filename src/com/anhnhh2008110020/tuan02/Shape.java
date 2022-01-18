package com.anhnhh2008110020.tuan02;

public class Shape {//khuôn mẫu để tạo Object

    String shape;

    public Shape(String newShape){
        shape = newShape;
    }

    //hành vi
    public void turn(){
        System.out.println("Xoay hinh 360 do... ");
    }

    public void play(){
        System.out.println("Choi tap tin am thanh.AIF.... ");
    }
    
}
