package oo;

import java.util.Scanner;

public class ManagerStudentTestDrive {
    
    public static void main(String[] args) {
        Scanner varInput = new Scanner(System.in);

        ManagerStudent student1 = new ManagerStudent("Hai", 1.5, 7.0f , 9.0f);
        ManagerStudent student2 = new ManagerStudent("Anh", 3.5, 8.0f, 10.0f);
        ManagerStudent student3 = new ManagerStudent();

        System.out.println("Enter name student: ");
        String name = varInput.nextLine();
        student3.setName(name);

        System.out.println("Enter code student: ");
        double code = varInput.nextDouble();
        student3.setCode(code);

        System.out.println("Enter score LT: ");
        float diemLT = varInput.nextFloat();
        student3.setDiemLT(diemLT);

        System.out.println("Enter score TH: ");
        float diemTH = varInput.nextFloat();
        student3.setDiemTH(diemTH);

        System.out.printf(student1.toString());
        System.out.printf(student2.toString());
        System.out.printf(student3.toString());

        varInput.close();
    }
    
    
}
