package oo;

public abstract class Animal {

    //attribute - thuoc tinh- state
    private String picture;
    private String food;
    private int hunger;
    private String ten;
    private String name;

    public String getTen(){
        return ten;
    }

    //protected abstract void beFriendly();
    //protected abstract void play();

    //method-behavior-interface-encapsulation
    protected abstract void makeNoise();
    

    protected void sleep(){
        System.out.println("Ngu thoi...");
    
    }
    protected abstract void eat();
     
    protected void roam(){
        System.out.println("Gum...");
    }
    
}
