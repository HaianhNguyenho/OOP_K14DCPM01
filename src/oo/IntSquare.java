package oo;

public class IntSquare {
    
    private double squareValue;//implementation

    //interface
    public double getSquareOperator(int value){
        //implementation - thuật toán
        this.squareValue = value * value;//operator X
        return this.squareValue;
    }
}
