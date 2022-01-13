package oo;

import java.util.Scanner;

public class Account {
    
    //data
    int account_number = 23456;
    int account_banlance=0;

    Scanner varInput = new Scanner(System.in);

    //function
     void deposit(){
        System.out.print("Nhap vao so tien can gui: ");
        int depositAmount = 0;
        depositAmount = varInput.nextInt();
        account_banlance += depositAmount;//thao tac len data
    }
   void withdraw(){
        System.out.print("Nhap vao so tien can rut: ");
        int withdrawAmount = 0;
        withdrawAmount = varInput.nextInt();
        account_banlance -= withdrawAmount ;
    }
   void show(){
        System.out.println("Thong tin tai khoan");
        System.out.println("Account number: "+account_number);
        System.out.println("Account balance: "+account_banlance);
    }
    
}
