public class Book {
    public String title;
    public String isbn;
    public Author author;
    public Book(String title, String isbn, Author author){
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }

    public String getTitle(){
        return title;
    }

    public String getIsbn(){
        return isbn;
    }

    public Author getAuthor(){
        return author;
    } 

    //ini untuk ngeprint detail buku
    public void displayBook(){
        System.out.println("Title\t: " + title);
        System.out.println("ISBN\t: " + isbn);
        System.out.println("Author\t: " +author.getName());
        System.out.println("Bio\t: " + author.getBio());
        System.out.println("------------------------");
    }
}
