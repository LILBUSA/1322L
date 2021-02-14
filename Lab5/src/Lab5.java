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
