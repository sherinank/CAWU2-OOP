import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<Book>();

    public Library(){
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added to Library : " + book.getTitle());
    }

    public void borrowBook (Borrower borrower, Book book){
        System.out.println(borrower.getName() + " borrowed: " + book.getTitle());
        borrower.borrowBook(book);
        books.remove(book);
    }
    public void returnBook(Borrower borrower, Book book){
        System.out.println(borrower.getName() + " returned: " + book.getTitle());
        books.add(book);
        borrower.returnBook(book);
    }

    public void displayLibraryBooks(){
        System.out.println("Books in library : ");
        //for each -> loop
        for(Book book : books){
            book.displayBook();
        }
    }

}
