package oo;

import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        Scanner varInput = new Scanner(System.in);
        System.out.print("Numerator: ");
        int numberator = 0;
        int denominator = 1;
        int result = 1;
        try{
            numberator = varInput.nextInt();

            System.out.print("Denominator: ");

            denominator = varInput.nextInt();
            
            result = numberator / denominator;

        }
        catch (ArithmeticException ex2){
            System.out.println("Khong chia 0!!!");

            ex2.printStackTrace();
        }
        catch (Exception ex){
            System.out.println("Loi roi tia oi!!");
            System.out.println("May ne nhap so/ con so do!!!");
            ex.printStackTrace();
        }
        System.out.printf("\nResult: %d / %d = %d\n", numberator, denominator, result);
    }
    
}
