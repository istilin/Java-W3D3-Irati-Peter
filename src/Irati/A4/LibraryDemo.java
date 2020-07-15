package Irati.A4;

public class LibraryDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Python introduction", "Irati", "2016", "This is a python introduction for newbies.");
        Book book2 = new Book("Machine learning introduction", "Irati", "2019", "This is a Machine learning introduction for newbies.");
        Book book3 = new Book("Data analysis introduction", "Irati", "2018", "This is a Data analysis introduction for newbies.");
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        System.out.println(library.getKeys());
        LibraryUser user = new LibraryUser(book1, library, "15.07.2020");
        user.displayRent();

        System.out.println(library.getKeys());

    }
}
