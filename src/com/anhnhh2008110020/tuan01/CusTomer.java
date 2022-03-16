package com.anhnhh2008110020.tuan01;

import java.util.Scanner;

public class CusTomer {
    //data
    String cusName;
    String address;

    Scanner varInput = new Scanner(System.in);

    //function
    void getCusName(){
        System.out.print("Nhập tên khách hàng: ");
        cusName = varInput.nextLine();
    }
    void getAddress(){
        System.out.print("Địa chỉ khách hàng ");
        address = varInput.nextLine();
    }
    String getCusInfor(){
        System.out.println(" Thông tin khách hàng ");
        System.out.println("Tên khách hàng: "+cusName);
        System.out.println("Địa chỉ khách hàng "+address);
        return cusName+address;
    }
}
