package Irati.A4;
import java.util.*;
import java.text.*;

public class LibraryUser {
    private Book rentedBook;
    private Library library;
    private String rentingStart;

    public LibraryUser( Book rentedBook, Library library, String rentingStart){
        this.rentedBook = rentedBook;
        this.library = library;
        this.rentingStart = rentingStart;
        library.removeBook(rentedBook);
    }

    public String getRentingEnd(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        Calendar c = Calendar.getInstance();
        try{
            //Setting the date to the given date
            c.setTime(sdf.parse(rentingStart));
        }catch(ParseException e){
            e.printStackTrace();
        }
        //Number of Days to add
        c.add(Calendar.DAY_OF_MONTH, 15);
        //Date after adding the days to the given date
        //Displaying the new Date after addition of Days
        return sdf.format(c.getTime());
    }

    public void displayRent(){
        System.out.println("\nYou rented the book: '"+ rentedBook.getName() + "'\nThe Author is: '" + rentedBook.getAuthor() + "'\nThe release year is: " + rentedBook.getYear() + "\nA brief description of the book: '" + rentedBook.getDescription() + "'\n\nYour renting date starts on: " + rentingStart + "\nYou have 15 days to return it. The latest day you can return the book is: " + this.getRentingEnd());
    }
}
