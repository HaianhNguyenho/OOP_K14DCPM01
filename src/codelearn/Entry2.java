package codelearn;

public class Entry2 {
    public static void main(String[] args) {
        Author[] authors = new Author[1];
        authors[0] = new Author("Viet", "Viet@gmail");

        Book book1 = new Book("Java", 210000, authors);
        System.out.println(book1.getAuthorNames());
        
    }
    
}
