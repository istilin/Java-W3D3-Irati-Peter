package peterAdv;

import java.util.ArrayList;

public class Library {

  String bookName;

  public Library(String bookName) {
    this.bookName = bookName;
  }

  static ArrayList <String> bookList = new ArrayList<>();

  public static ArrayList<String> getBookList() {
    return bookList;
  }
}
