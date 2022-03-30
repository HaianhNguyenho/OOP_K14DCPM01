package oo;

public class Cho {

    //thuoc tinh

    private int size;

    //khoi static

    static{
        System.out.println("Khoi tao du lieu...");
    }
    private static int count;

    public static int getCount(){

    return count;
    }
    public void bark(){
        System.out.println("Sua...");
    }
    public Cho(){
       count++;//thanh vien object co the truy cap vao thanh vien class
    }

    
}
