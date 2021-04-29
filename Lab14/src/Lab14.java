import java.util.LinkedList;
import java.util.Scanner;

public class Lab14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BlueRayCollection blueCollect = new BlueRayCollection();
        int choice = -1;

        do {
            System.out.println("0. Quit");
            System.out.println("1. Add BlueRay to Collection");
            System.out.println("2. See Collection");
            System.out.println("3. Search Collection");
            System.out.println("4. Remove BlueRay from Collection");
            choice = scan.nextInt();
            scan.nextLine();

            if (choice == 1) {
                System.out.println("What is the title?");
                String title = scan.nextLine();
                System.out.println("What is the director?");
                String director = scan.nextLine();
                System.out.println("What is the year of release?");
                int releaseYear = scan.nextInt();
                System.out.println("What is the cost?");
                double cost = scan.nextDouble();
                blueCollect.add(title, director, releaseYear, cost);
            } else if (choice == 2) {
                blueCollect.showAll();
            } else if (choice == 3) {
                System.out.println("What title to search for?");
                String titleSearch = scan.nextLine();
                System.out.println(blueCollect.search(titleSearch));
            } else if (choice == 4) {
                System.out.println("What title to remove?");
                String titleRemove = scan.nextLine();
                if (blueCollect.remove(titleRemove)) {
                    System.out.println(titleRemove + " deleted");
                } else {
                    System.out.println("Not Found");
                }
            }
        } while(choice != 0);

    }
}

class BlueRayDisk {
    public String title;
    public String director;
    public int releaseYear;
    public double cost;

    public BlueRayDisk(String title, String director, int releaseYear, double cost) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "$" + cost + " " + releaseYear + " " + title + ", " + director;
    }
}

class Node {
    public BlueRayDisk blue;
    public Node next;
}

class BlueRayCollection {
    private Node head = null;

    public void add(String title, String director, int releaseYear, double cost) {
        Node nd = new Node();
        nd.blue = new BlueRayDisk(title, director, releaseYear, cost);
        nd.next = head;
        head = nd;
    }

    public void showAll() {
        try {
            Node current = head;
            do {
                System.out.println(current.blue.toString());
                current = current.next;
            } while (current != null);
        } catch (NullPointerException e) {}
    }

    public String search(String title) {
        try {
            Node current = head;
            do {
                if (current.blue.title.equals(title)) {
                    return current.blue.toString();
                }
                current = current.next;
            } while (current != null);
            return "Not Found";
        } catch (NullPointerException e) {
            return "No BlueRays Found";
        }

    }

    public boolean remove(String title) {
        try {
            Node current = head;
            do {
                if (current.blue.title.equals(title)) {
                    current.blue = null;
                    return true;
                }
                current = current.next;
            } while (current != null);
            return false;
        } catch (NullPointerException e) {
            return false;
        }
    }
}
