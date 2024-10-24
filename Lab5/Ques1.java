import java.util.*;

// Book class
class Book{
    private int bookId;
    private String bookName;
    private String authorName;

    // parameterized constructor
    public Book(int bookId, String bookName, String authorName){
        super();
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;

    }

    // Overriding to display all the details using toString
    @Override
    public String toString(){
        return "Book [bookId=" + bookId + ", bookName=" + bookName + ",authorname="+ authorName + "]";
    }
}

public class Ques1{
    public static void main(String[] args) {

        // Creating arraylist of objects of type Book
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book(101,"let us c","Yashwant P Kanetkar"));
        books.add(new Book(102,"head first java","Kathy Sierra"));

        // Printing all the details of all the books using enhanced for loop.
        System.out.println("--All Books--");
        for(Book b : books){
            System.out.println(b);
        }
    }
}