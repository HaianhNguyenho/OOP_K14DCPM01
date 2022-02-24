package oo;

public class IntSquare {
    
    private double squareValue;//implementation

    //Abstraction

    //interface
    public double getSquare(int value){
        //implementation - thuật toán
        this.calculateSquare(value);
        return this.squareValue;
    }
    //implementation
    private void calculateSquare(int value){
        this.squareValue = Math.pow(value, 2); //Math
    }
}
