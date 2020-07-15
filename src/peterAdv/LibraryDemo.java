package peterAdv;



public class LibraryDemo {
  public static void main(String[] args) {
    new Book("Peter learns Java", "Simon");
    new Book("Peter went crazy","Peter");
    new Book("abcde","edcba");

    new LibraryUser();
    LibraryUser.rentBook();
  }
}
