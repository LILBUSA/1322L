import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int current = 0;

        do {
            System.out.println("What is the current temperature? (Enter -1 to exit)");
            current = scan.nextInt();
            if (current == -1) {
                break;
            }
            Environment enviro = new Environment(current);
            Cricket cricket = new Cricket();
            Cricket clemson = new ClemsonCricket();
            System.out.println("Normal cricket: " + current + " degrees yields " + cricket.getChirpCount(enviro) + " chirps per minute");
            System.out.println("Clemson cricket: " + current + " degrees yields " + clemson.getChirpCount(enviro) + " chirps per minute");
        } while(current != -1);
    }
}
