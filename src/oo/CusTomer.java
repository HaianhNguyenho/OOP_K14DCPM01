package oo;

import java.util.Scanner;

public class CusTomer {
    //data
    String cusName;
    String address;

    Scanner varInput = new Scanner(System.in);

    //function
    void getCusName(){
        System.out.print("Nhap ten khach hang: ");
        cusName = varInput.nextLine();
    }
    void getAddress(){
        System.out.print("Dia chi khach hang: ");
        address = varInput.nextLine();
    }
    String getCusInfor(){
        System.out.println("Thong tin khach hang: ");
        System.out.println("Ten khach hang: "+cusName);
        System.out.println("Dia chi khach hang "+address);
        return cusName+address;
    }
}
