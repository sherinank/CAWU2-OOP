import java.util.ArrayList;

class Borrower {
    public String name;
    public ArrayList<Book> borrowBook; //BOOK adalah tipe data
    //berfungsi untuk membuat & menginisialisasi daftar yg dapat menampung objek di Book

    public Borrower(String name){
        this.name = name;
        this.borrowBook = new ArrayList();
    }

    public String getName(){
        return name;
    }
    
    public void borrowBook(Book book){
        borrowBook.add(book);
    }
    
    public void returnBook(Book book){
        borrowBook.remove(book);
    }
    
    public void displayBorrowedBooks(){
        System.out.println(name + "'s borrowed books : ");
        //for eachc->untuk looping
        for(Book book : borrowBook){
            book.displayBook();
        }
    }
    
}