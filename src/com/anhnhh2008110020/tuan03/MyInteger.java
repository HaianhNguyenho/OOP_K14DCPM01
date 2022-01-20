package com.anhnhh2008110020.tuan03;

public class MyInteger {

 private  int value ;

    public MyInteger(int initialValue){
        value = initialValue;
    }

    public MyInteger(){
        this(2);
    }
   public MyInteger(MyInteger other){
        this(other.value);
    }
    public boolean greaterThan (MyInteger other ){
        return(this.value > other.value);
    }
    public boolean lessThan (MyInteger other){
        return(other.greaterThan(this));
    }
    public MyInteger increment(){
        System.out.println("Gia tri: "+value++);
        
        return this;
    }
}
