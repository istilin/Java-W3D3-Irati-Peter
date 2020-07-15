package peterAdv;

public class Book extends Library{

  String author;



  public Book(String bookName,String author) {
    super(bookName);this.author=author;
    bookList.add(bookName+" "+author);
  }
}

