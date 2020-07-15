package Irati.A4;

public class Book {
    private String name;
    private String author;
    private String year;
    private String description;

    public Book(String name, String author, String year, String description){
        this.name = name;
        this.author = author;
        this.year = year;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getYear() {
        return year;
    }

    public String getDescription() {
        return description;
    }
}
