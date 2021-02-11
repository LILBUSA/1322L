import java.util.Scanner;
public class Lab5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Item[] items = new Item[5];

        for (int i = 0; i < items.length; i++) {
            String str;
            System.out.println("Please enter B for Book or P for Periodical");
            str = scan.nextLine();
            if (str.equals("B")) {
                System.out.println("Please enter the name of the Book");
                String name = scan.nextLine();
                System.out.println("Please enter the author of the Book");
                String author = scan.nextLine();
                System.out.println("Please enter the ISBN of the Book");
                int isbn = scan.nextInt();
                scan.nextLine();
                items[i] = new Book(name, author, isbn);
            } else if (str.equals("P")) {
                System.out.println("Please enter the name of the Periodical");
                String name = scan.nextLine();
                System.out.println("Please enter the issue number");
                int issueNum = scan.nextInt();
                scan.nextLine();
                items[i] = new Periodical(name, issueNum);
            } else {
                i--;
            }
        }
        System.out.println("Your Items:");
        for (Item item: items) {
            System.out.println(item.getListing());
            System.out.println();
        }
    }
}

abstract class Item {
    private String title;

    public Item() {
        this.title = "";
    }

    public Item(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract String getListing();

    @Override
    public String toString() {
        return title;
    }
}

class Book extends Item {
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

class Periodical extends Item {
    private int issueNum;

    public Periodical() {}

    public Periodical(String title, int issueNum) {
        super(title);
        this.issueNum = issueNum;
    }

    public int getIssueNum() {
        return issueNum;
    }

    public void setIssueNum(int issueNum){
        this.issueNum = issueNum;
    }

    public String getListing() {
        return "Periodical Title - " + getTitle() + "\nIssue # - " + getIssueNum();
    }
}
