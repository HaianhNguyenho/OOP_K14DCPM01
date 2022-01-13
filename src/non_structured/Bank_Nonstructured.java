package non_structured;

import java.util.Scanner;

public class Bank_Nonstructured {
    public static void main(String[] args) {
        //data
        //khai bao 2 bien
        int account_number = 12345;
        int account_banlance = 0;

        //hanh dong thao tac len data
        Scanner varInput;
        varInput = new Scanner(System.in);

        //gui tien: deposit
        System.out.print("Nhap vao so tien can gui: ");
        int depositAmount = 0;
        depositAmount = varInput.nextInt();
        account_banlance += depositAmount;// thao tac lemn data

        //show
        System.out.println("Thong tin tai khoan");
        System.out.println("Account number: "+account_number);
        System.out.println("Account balance: "+account_banlance);

        //rut tien: withdraw
        System.out.print("Nhap vao so tien can rut: ");
        int withdrawAmount = 0;
        withdrawAmount = varInput.nextInt();
        account_banlance -= withdrawAmount ;// thao tac len data
        //account_banlance -= account_balance - withdrawAmount;
        System.out.println("Thong tin tai khoan");
        System.out.println("Account number: "+account_number);
        System.out.println("Account banlance: "+account_banlance);

        
    }
    
}
