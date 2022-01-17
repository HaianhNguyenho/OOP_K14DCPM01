package com.anhnhh2008110020.tuan02;

import java.util.Scanner;


public class ShapeTestDrive {
    public static void main(String[] args) {
        //khởi tạo đối tượng 
        Shape circle = new Shape("Hinh dang tron");
        Shape triangle = new Shape("Hinh dang tam giac");
        Shape square = new Shape("Hinh dang vuong");

        Scanner varInput = new Scanner(System.in);

        while(true){
            System.out.println("==================MENU-XOAY HINH=================");
            System.out.println("Opption 1: Xoay hinh dang tron");
            System.out.println("Opption 2: Xoay hinh dang tam giac");
            System.out.println("Opption 3: Xoay hinh dang vuong");
            System.out.println("Opption 4: Thoat chuong trinh: ");
            System.out.println("=================KET THUC======================");

            System.out.print("Chon opption tu 1=>4: ");
            switch(varInput.nextInt()){
                case 1:
                System.out.println("Da chon hinh dang tron");
                circle.turn();
                break;
                case 2:
                System.out.println("Da chon hinh dang tam giac");
                triangle.turn();
                break;
                case 3:
                System.out.println("Da chon hinh dang vuong");
                square.turn();
                break;
                case 4:
                System.out.println("Thoat chuong trinh xoay hinh");
                System.exit(0);
                break;
               default:
               System.out.println("Bạn chọn sai rồi. Vui lòng chọn lại option!");

            }
            

            
        }
        


    }
    
}
