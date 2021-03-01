import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        int choice = 0;
        do {
            System.out.println("0 - Exit");
            System.out.println("1 - Addition");
            System.out.println("2 - Subtraction");
            System.out.println("3 - Multiplication");
            System.out.println("4 - Division");
            System.out.print("Please Choose an Option: ");
            choice = scan.nextInt();

            if (choice == 1) {
              System.out.print("Please enter the first number ");
              float num1 = scan.nextFloat();
              System.out.print("Please enter the second number ");
              float num2 = scan.nextFloat();
              System.out.println(calc.add(num1, num2));
            } else if (choice == 2) {
              System.out.print("Please enter the first number ");
              float num1 = scan.nextFloat();
              System.out.print("Please enter the second number ");
              float num2 = scan.nextFloat();
              System.out.println(calc.subtract(num1, num2));
            }else if (choice == 3) {
              System.out.print("Please enter the first number ");
              float num1 = scan.nextFloat();
              System.out.print("Please enter the second number ");
              float num2 = scan.nextFloat();
              System.out.println(calc.multiply(num1, num2));
            } else if (choice == 4) {
              System.out.print("Please enter the first number ");
              float num1 = scan.nextFloat();
              System.out.print("Please enter the second number ");
              float num2 = scan.nextFloat();
              System.out.println(calc.divide(num1, num2));
            }
            System.out.println();
        } while(choice != 0);
    }
}
