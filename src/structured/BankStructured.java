package structured;

import java.util.Scanner;
//toan cuc: global


public class BankStructured {

static int account_number = 12345;
static int account_banlance = 0;
//data employee
static String enName;// ten nhan vien
static double salary;// luong
     
     //data Customer
     static String cusName;
     static String address;
     static Scanner varInput;

    public static void main(String[] args) {
        //khai bao bien local: cucbo
       
    
        varInput = new Scanner(System.in);
        deposit();
        withdraw();
        show();//make function call
        getEnName();
        getSalary();
        getCusInfor();
     
    }
  static void deposit(){
        System.out.print("Nhap vao so tien can gui: ");
        int depositAmount = 0;
        depositAmount = varInput.nextInt();
        account_banlance += depositAmount;
    }
  static void withdraw(){
        System.out.print("Nhap vao so tien can rut: ");
        int withdrawAmount = 0;
        withdrawAmount = varInput.nextInt();
        account_banlance -= withdrawAmount ;
    }
  static void show(){
        System.out.println("Thong tin tai khoan");
        System.out.println("Account number: "+account_number);
        System.out.println("Account balance: "+account_banlance);
    }
    static void getEnName(){
        enName = "";
        cusName = "ABC";//ko duoc quyen dung cham den du lieu cua customer
    }
    static void getSalary(){
        salary = 500;
    }
    static String getCusInfor(){
        account_banlance =0; // vo tinh hay co y thao tac len du lieu ma dang le function khong nen dung cham den data do
        return cusName + address;
    }
    

}
