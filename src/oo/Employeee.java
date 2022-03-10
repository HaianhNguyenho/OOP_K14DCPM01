package oo;




public class Employeee extends Person{
    private double salary;

    @Override
    public String toString() {
        return "Employeee [salary=" + salary + "]" + " Name: "+this.name+" birthday: "+ this.birthday;
    }


    
    
}
