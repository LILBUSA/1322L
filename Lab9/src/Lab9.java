import java.util.Scanner;

public class Lab9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Choose from the following: ");
            System.out.println("0. Quit");
            System.out.println("1. Multiply 2 numbers");
            System.out.println("2. Div 2 numbers");
            System.out.println("3. Mod 2 numbers");
            choice = scan.nextInt();

            if (choice == 1) {
                System.out.println("Enter first number");
                int x = scan.nextInt();
                System.out.println("Enter second number");
                int y = scan.nextInt();
                System.out.println("Answer: " + recursiveMultiply(x, y));
            } else if (choice == 2) {
                System.out.println("Enter first number");
                int x = scan.nextInt();
                System.out.println("Enter second number");
                int y = scan.nextInt();
                System.out.println("Answer: " + recursiveDivide(x, y));
            } else if (choice == 3) {
                System.out.println("Enter first number");
                int x = scan.nextInt();
                System.out.println("Enter second number");
                int y = scan.nextInt();
                System.out.println("Answer: " + recursiveMod(x, y));
            }
        } while(choice != 0);
    }

    public static int recursiveMultiply(int num1, int num2) {
        if (num1 < num2) {
            return recursiveMultiply(num2, num1);
        } else if (num2 != 0) {
            return (num1 + recursiveMultiply(num1, num2 - 1));
        } else {
            return 0;
        }
    }

    // how many times does num2 go into num1
    public static int recursiveDivide(int num1, int num2) {
        if (num2 == 0) {
            return -1;
        } else if (num1 == num2) {
            return 1;
        } else if (num1 < num2) {
            return 0;
        } else if (num1 > num2) {
            return 1 + recursiveDivide(num1 - num2, num2);
        } else {
            return 0;
        }
    }

    public static int recursiveMod(int num1, int num2) {
        if (num2 == 0) {
            return -1;
        } else if (num1 < num2) {
            return num1;
        } else if (!((num1 - num2) < 0)) {
            return recursiveMod(num1 - num2, num2);
        } else {
            return num1;
        }
    }
}
