package com.anhnhh2008110020.tuan07;

import java.util.Scanner;

public class AccountBankABCTestDrive {
   static Scanner varInput =  new Scanner(System.in);
    static void nhapTK(AccountBankABC account){
        System.out.println("Nhap so tai khoan:  ");
        account.setSoTaiKhoan(varInput.nextInt());
        varInput.nextLine();
        System.out.println("Nhap ten tai khoan: ");
        account.setTenTaiKhoan(varInput.nextLine());
        account.setSoTienTaiKhoan(50000);
    }
    public static void main(String[] args) {
        AccountBankABC a[] = null;
        int g,h,k = 0;
        long n,m,l;
        boolean khoiLenh = true;
        do{
            System.out.println("================MENU===================");
            System.out.println(">>1. Nhap thong tin tai khoan cua khach hang\n");
            System.out.println(">>2. Xuat danh sach thong tin tai khoan khach hang\n");
            System.out.println(">>3. Nap tien vo tai khoan\n");
            System.out.println(">>4. Rut tien vo tai khoan\n");
            System.out.println(">>5. Dao han\n ");
            System.out.println(">>6. Chuyen khoan\n ");
            System.out.println(">>7. Thoat\n ");
            h= varInput.nextInt();
            switch(h){
                case 1:
                    System.out.println("Nhap so luong khach hang\n ");
                    k = varInput.nextInt();
                    a= new AccountBankABC[k];
                    for(int i = 0; i<k; i++){
                        System.out.println("Khach hang thu: "+(i+1));
                        
                    }


            }

        }while(khoiLenh);

    }
    
}
