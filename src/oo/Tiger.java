package oo;

public class Tiger extends Feline{

    public Tiger(){}

    @Override
    protected void makeNoise(){
        System.out.println("Tiger sound ...");

    }
    @Override
    protected void eat(){
        System.out.println("Eating...");
    }
    
}
