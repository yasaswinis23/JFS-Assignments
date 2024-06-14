public class Book {
    private String title;
    private String author;
    private String isbn;
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }


    public String getIsbn() {
        return isbn;
    }

    public static void main(String[] args) {
    
        Book book = new Book("Java Programming", "John Doe", "978-0135166307");


        System.out.println("Title: " + book.getTitle());
        System.out.println("====================");
        System.out.println("Author: " + book.getAuthor());
        System.out.println("====================");
        System.out.println("ISBN: " + book.getIsbn());
    }
}
