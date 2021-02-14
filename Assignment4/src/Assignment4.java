import java.util.*;
public class Assignment4 {
    public static void main(String[] args) {
        GuessNumber gn = new GuessNumber();
        gn.playGame();
    }
}

abstract class Language {
    public abstract String makeGuess();
    public abstract String tooLow();
    public abstract String tooHigh();
    public abstract String correct();
}

class English extends Language {
    @Override
    public String makeGuess() {
        return "Guess a number";
    }
    @Override
    public String tooLow() {
        return "Too Low";
    }
    @Override
    public String tooHigh() {
        return "Too High";
    }
    @Override
    public String correct() {
        return "Correct";
    }
}
class Spanish extends Language {
    @Override
    public String makeGuess() {
        return "Adivina un numero";
    }
    @Override
    public String tooLow() {
        return "Demasisado bajo";
    }
    @Override
    public String tooHigh() {
        return "Demasiado alto";
    }
    @Override
    public String correct() {
        return "Correcto";
    }
}
class French extends Language {
    @Override
    public String makeGuess() {
        return "Devinez un nombre ";
    }
    @Override
    public String tooLow() {
        return "Trop bas";
    }
    @Override
    public String tooHigh() {
        return "Trop haut";
    }
    @Override
    public String correct() {
        return "Correct";
    }
}
class SimplifiedChinese extends Language {
    @Override
    public String makeGuess() {
        return "猜一个数字";
    }
    @Override
    public String tooLow() {
        return "太低";
    }
    @Override
    public String tooHigh() {
        return "太高";
    }
    @Override
    public String correct() {
        return "正确";
    }
}

class GuessNumber {
    Scanner scan = new Scanner(System.in);
    Random myRand = new Random();

    public void playGame() {
        int num = myRand.nextInt(100);
        System.out.println("Choose your language");
        System.out.println("1. English");
        System.out.println("2. Español");
        System.out.println("3. Français");
        System.out.println("4. 简体中文");
        int choice = scan.nextInt();
        Language lang = null;
        if (choice == 1) {
            lang = new English();
        } else if (choice == 2) {
            lang = new Spanish();
        } else if (choice == 3) {
            lang = new French();
        } else if (choice == 4) {
            lang = new SimplifiedChinese();
        }
        while(true) {
            System.out.println(lang.makeGuess());
            int guess = scan.nextInt();
            if (guess < num) {
                System.out.println(lang.tooLow());
            } else if (guess > num) {
                System.out.println(lang.tooHigh());
            } else if (guess == num) {
                System.out.println(lang.correct());
                return;
            }
        }
    }
}

