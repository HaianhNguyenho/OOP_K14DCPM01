package codelearn;

public class Employee1 extends Person {

    private int salary;

    public Employee1(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }
    
    public void display(){
        System.out.println("Employee name: "+super.getName());
        System.out.println("Employee address: "+super.getAddress());
        System.out.println("Employee salary: "+salary);
    }

    
}
