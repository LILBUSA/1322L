public class Book extends Item {
    private int isbn;
    private String author;

    public Book(){}

    public Book(String title, String author, int isbn) {
        super(title);
        this.author = author;
        this.isbn = isbn;

    }

    public int getISBN() {
        return isbn;
    }

    public void setISBN(int isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String getListing() {
        return "Book Name - " + getTitle() + "\nAuthor - " + getAuthor() + "\nISBN # - " + getISBN();
    }
}
