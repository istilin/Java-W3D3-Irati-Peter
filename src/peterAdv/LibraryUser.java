package peterAdv;

public class LibraryUser{
  String name;
  int rentTime;




  public LibraryUser() {
    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.println("Whats the library-Users name?: ");
    this.name = sc.nextLine();
    System.out.println("Whats the library-Users rent time?: ");
    this.rentTime = sc.nextInt();
  }

  public static void rentBook(){


    for (String s :Library.getBookList())
      System.out.println(s);

      System.out.println("What book do you want to rent?: ");
      java.util.Scanner sc = new java.util.Scanner(System.in);
      int i = sc.nextInt();
      System.out.println("Your choice: "+ Library.getBookList().get(i));
    Library.getBookList().remove(i);
  }
}
