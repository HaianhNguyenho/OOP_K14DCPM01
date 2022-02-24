package oo;

public class IntSquare {
    
    private double squareValue;//implementation

    //interface
    public double getSquareMath(int value){
        //implementation - thuật toán
        this.squareValue = Math.pow(value, 2);//operator X
        return this.squareValue;
    }
}
