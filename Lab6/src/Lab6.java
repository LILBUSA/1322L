import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        FibIteration iteration = new FibIteration();
        FibFormula formula = new FibFormula();
        System.out.println("Enter the number you want to find the Fibonacci Series for:");
        int n = scan.nextInt();
        System.out.println("Fib of " + n + " by iteration is: " + iteration.calculateFib(n));
        System.out.println("Fib of " + n + " by formula is: " + formula.calculateFib(n));
    }
}
