package oo;

import java.util.Scanner;

public class Empoyee {
    // data
    String enName;
    double salary;

    Scanner varInput = new Scanner(System.in);

    //function
    void  getEnName(){
        System.out.print("Nhap ten nhan vien: ");
        
        enName = varInput.nextLine();
    }

    void getSalary(){
        System.out.print("Nhap luong nhan vien: ");
        
        salary = varInput.nextDouble();
        
    }
    String getEmInfor(){
        System.out.println("Thong tin nhan vien: ");
        System.out.println("Ten nhan vien la: "+enName);
        System.out.println("Luong nhan vien la: "+salary + "dong");
        return enName+salary;
    }
    
}
