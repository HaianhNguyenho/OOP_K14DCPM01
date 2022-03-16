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
        long n,m,l, o;
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
            System.out.println("Nhap su lua chon: ");
            h= varInput.nextInt();
            switch(h){
                case 1:
                    System.out.println("Nhap so luong khach hang\n ");
                    k = varInput.nextInt();
                    a= new AccountBankABC[k];
                    for(int i = 0; i<k; i++){
                        System.out.println("Khach hang thu: "+(i+1));
                        a[i] = new AccountBankABC();
                        nhapTK(a[i]);
                    }
                    break;
                case 2:
                System.out.println("Xuat danh sach tai khoan khach hang");
                for(int i = 0; i<k; i++){
                    System.out.println("Khach hang thu: "+(i+1));
                    a[i].inThongTinTK();
                }
                break;
                case 3:
                System.out.println("Nhap so tai khoan can nap tien ");
                n = varInput.nextLong();
                for(int i=0; i < k; i++){
                    m = a[i].getSoTaiKhoan();
                    if(n == m){
                        System.out.println("Ban chon tai khoan "+n);
                        a[i].napTien();
                    }else{
                        System.out.println("Khong tim thay tai khoan");
                    }
                }
                break;
                case 4:
                System.out.println("Nhap so tai khoan can rut tien ");
                n = varInput.nextLong();
                for(int i = 0; i<k; i++){
                    m = a[i].getSoTaiKhoan();
                    if(n == m){
                        System.out.println("Ban chon tai khoan: "+m);
                        a[i].rutTien();
                    }else{
                        System.out.println("Khong tim thay tai khoan ");
                    }
                }

                case 5:
                System.out.println("Nhap so tai khoan can dao han: ");
                n = varInput.nextLong();
                for (int i = 0; i<k; i++){
                    m=a[i].getSoTaiKhoan();
                    if(n == m){
                        System.out.println("Ban chon tai khoan: "+m);
                        a[i].daoHan();
                    }else{
                        System.out.println("Khong tim thay tai khoan");
                    }
                }
                case 6:
                double chuyenTien, nhanTien, tienChuyen;
                System.out.println("Nhap so tai khoan khach hang chuyen tien ");
                n = varInput.nextLong();
                System.out.println("Nhap so tai khoan khach hang nhan tien ");
                l=varInput.nextLong();
                for(int i = 0; i < k; i++){
                    m = a[i].getSoTaiKhoan();
                    if(n==m){
                        chuyenTien = a[i].getSoTienTaiKhoan();
                        for(int j = 0; j<k; j++){
                            o = a[j].getSoTaiKhoan();
                            if(l == o){
                                nhanTien = a[j].getSoTienTaiKhoan();
                                System.out.println("Nhap so tien can chuyen");
                                tienChuyen = varInput.nextDouble();
                                if(tienChuyen <= chuyenTien){
                                    chuyenTien = chuyenTien - tienChuyen;
                                    nhanTien = nhanTien + tienChuyen;
                                    a[i].setSoTienTaiKhoan(chuyenTien);
                                    a[j].setSoTienTaiKhoan(nhanTien);
                                    System.out.println("Tai khoan so "+ m + "vua chuyen" +tienChuyen);
                                    System.out.println("Tai khoan so " + o + "vua nhan" +tienChuyen);  
                                }else{
                                    System.out.println("So tien nhap khong hop le! ");
                                }

                            }else{
                                System.out.println("Khong tim thay tai khoan");
                            }
                           
                        } 
                        break;

                        
                    }
                }
                break;
                default:
                System.out.println("Khong tim thay tai khoan ");
                khoiLenh = false;
                break;


            }

        }while(khoiLenh);

    }
    
}
