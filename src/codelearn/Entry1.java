package codelearn;

public class Entry1 {
    public static void main(String[] args) {
        Customer customer = new Customer(2000, "Tuan",20);
        Invoice invoice = new Invoice(1000, customer,1000000);

        System.out.println("Customer name: "+invoice.getCusTomerName());
        System.out.println("Invoice after discount: "+invoice.getAmount());
    }
    
}
