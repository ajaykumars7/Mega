package Exercises;

public class Book {
    static int totalBooks;
    String title;
    String author;
    double isbn;

    static {
        totalBooks = 0;
    }
    {
        totalBooks ++;
    }
    Book(String title, String author, double isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    Book(double isbn){
        this("unknown", "unknown", isbn);
    }
    static int getTotalBooks(){
        return totalBooks;
    }
    void borrowBook(){
        totalBooks -= totalBooks;
    }
    void returnBook(){
        totalBooks += totalBooks;
    }

}
