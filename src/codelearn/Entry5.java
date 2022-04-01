package codelearn;

public class Entry5 {
    public static void main(String[] args) {
        IEmployee employee = new PartTimeEmployee("Trung", 450000, 7);
        System.out.println("Salary perday: "+employee.getName());
        System.out.println("Salary per day: "+employee.calculateSalary());


        IEmployee employee2 = new FullTimeEmployee("Linh", 65000);
        System.out.println("Name: "+employee2.getName());
        System.out.println("Salary per day: "+employee2.calculateSalary());
    }
    
}
