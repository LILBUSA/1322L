import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Checking checking = new Checking(0);
        Savings savings = new Savings(0);
        int choice = 0;
        do {
            System.out.println("1. Withdraw from Checking");
            System.out.println("2. Withdraw from Savings");
            System.out.println("3. Deposit to Checking");
            System.out.println("4. Deposit to Savings");
            System.out.println("5. Balance of Checking");
            System.out.println("6. Balance of Savings");
            System.out.println("7. Award Interest to Savings now");
            System.out.println("8. Quit");

            choice = scan.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("How much would you like to withdraw from Checking?");
                    double withdrawChecking = scan.nextDouble();
                    checking.withdraw(withdrawChecking);
                    break;
                case 2:
                    System.out.println("How much would you like to withdraw from Savings?");
                    double withdrawSavings = scan.nextDouble();
                    savings.withdraw(withdrawSavings);
                    break;
                case 3:
                    System.out.println("How much would you like to deposit into Checking?");
                    double depositChecking = scan.nextDouble();
                    checking.deposit(depositChecking);
                    break;
                case 4:
                    System.out.println("How much would you like to deposit into Savings?");
                    double depositSavings = scan.nextDouble();
                    savings.deposit(depositSavings);
                    break;
                case 5:
                    System.out.println("Your balance for checking " + checking.getNumber() + " is " + checking.getBalance());
                    break;
                case 6:
                    System.out.println("Your balance for savings " + savings.getNumber() + " is " + savings.getBalance());
                    break;
                case 7:
                    savings.addInterest();
                    break;
                case 8:
                    break;
                default:
                    System.out.println("ERROR: Please input an integer between 1 and 8");
            }
        } while(choice != 8);
    }
}

class Account {
    private static int id = 10000;
    private int accountNumber;
    private double accountBalance;

    public Account() {
        accountBalance = 0;
        id++;
        accountNumber = id;
    }

    public Account(double accountBalance) {
        this.accountBalance = accountBalance;
        id++;
        accountNumber = id;
        //System.out.println("Account Number: " + accountNumber);
    }

    public int getNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return accountBalance;
    }

    public void setBalance(double balance) {
        accountBalance = balance;
    }

    public void withdraw(double amount) {
        accountBalance -= amount;
    }

    public void deposit(double amount) {
        accountBalance += amount;
    }
}

class Checking extends Account {

    public Checking(double accountBalance) {
        super(accountBalance);

    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        if (getBalance() < 0) {
            System.out.println("Charging an overdraft fee of $20 because account is below $0");
            setBalance(getBalance() - 20);
        }
    }
}

class Savings extends Account {
    private int numDeposits;

    public Savings(double accountBalance) {
        super(accountBalance);
        numDeposits = 0;
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        if (getBalance() < 500) {
            System.out.println("Charging a fee of $10 because you are below $500");
            setBalance(getBalance() - 10);
        }
    }

    @Override
    public void deposit(double amount) {
        numDeposits++;
        super.deposit(amount);
        System.out.println("This is deposit number " + numDeposits + " to this account");
        if (numDeposits > 5) {
            System.out.println("Charging a fee of $10");
            setBalance(getBalance() - 10);
        }
    }

    public void addInterest() {
        double interest = getBalance()*0.015;
        System.out.println("Customer earned " + interest + " in interest");
        setBalance(getBalance() + interest);
    }
}