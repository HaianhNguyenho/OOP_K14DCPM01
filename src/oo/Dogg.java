package oo;

public class Dogg extends Animal {

    @Override
    protected void makeNoise() {
        System.out.println("Gau gau...");

    
    }
    @Override
    protected void eat() {
        
        System.out.println("Eating pone");
    }
    public void protecteHouse(){
        System.out.println("Protecting...");
    }
    public void cheseCat(){
        System.out.println("Chasing cat...");
    }
}
