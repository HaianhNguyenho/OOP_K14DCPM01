package com.anhnhh2008110020.tuan01;

public class StudentTestDrive {
    public static void main(String[] args) {
        //Student tuanStudent = new Student();
        //tuanStudent.hoc();

        //Student ducStudent = new Student();
        //ducStudent.thi();

        //Student minhStudent = new Student();
       // minhStudent.dangKyMonHoc();
        
        Student haianhStudent = new Student(false,20,"Nguyen Ho Hai Anh","CNTT", 5.0 );
        Student vannStudent =  new Student(true, 19,"Nguyen Van","CNTT", 6.0);

        haianhStudent.show();
        vannStudent.show();
    }
}
