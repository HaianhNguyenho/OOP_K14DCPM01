package oo;

public class Animal {

    //attribute - thuoc tinh- state
    private String picture;
    private String food;
    private int hunger;

    //method-behavior
    protected void makeNoise(){
        System.out.println("Doi qua ....");
    }

    protected void sleep(){
        System.out.println("Ngu thoi...");
    
    }
    protected void eat(){
        System.out.println("Muon an...");

    }
    protected void roam(){
        System.out.println("Gum...");
    }
    
}
