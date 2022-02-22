package oo;

public class Player {
    //attribue
    int number =0 ;

    //method
    public void guess(){
        number = (int) (Math.random() * 10);
        System.out.println("In'm guessting" + number); 
    }
    
}
