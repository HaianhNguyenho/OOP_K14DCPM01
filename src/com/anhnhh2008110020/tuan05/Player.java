package com.anhnhh2008110020.tuan05;

public class Player {
     //attribute
    private int number =0 ;

    

     public int getNumber() {
        return number;
    }



    public void setNumber(int number) {
        this.number = number;
    }



    //method
     public void guess(){
         number = (int) (Math.random() * 10);
         System.out.println("I'm guessting "+" "+ number); 
     }
    
}
