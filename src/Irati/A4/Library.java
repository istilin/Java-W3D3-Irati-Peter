package Irati.A4;
import java.util.*;

public class Library {
    private HashMap <String, Book> books = new HashMap<>();
    private ArrayList<String> allKeys = new ArrayList<>();

    public void addBook(Book book){
        books.put(book.getName(), book);
    }

    public ArrayList<String> getKeys(){
        allKeys.clear();
        allKeys.addAll(books.keySet());
        return allKeys;
    }

    public HashMap <String, Book> getBooks(){
        return books;
    }

    public void removeBook(Book book){
        books.remove(book.getName());
    }
}
