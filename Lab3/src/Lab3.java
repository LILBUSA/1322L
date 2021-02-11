import java.util.ArrayList;
import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Quiz quiz = new Quiz();
        int choice;
        do {
            out();
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    quiz.add_question();
                    break;
                case 2:
                    quiz.remove_question();
                    break;
                case 3:
                    quiz.modify_question();
                    break;
                case 4:
                    quiz.give_quiz();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("ERROR: Give integer between 1 and 5");
            }
        } while(choice != 5);
    }

    public static void out() {
        System.out.println("What would you like to do?");
        System.out.println("1. Add a question to the quiz");
        System.out.println("2. Remove a question from the quiz");
        System.out.println("3. Modify a question in the quiz");
        System.out.println("4. Take the quiz");
        System.out.println("5. Quit");
    }
}

class Question {
    private String text;
    private String answer;
    private int difficulty;

    Question(String text, String answer, int difficulty) {
        this.text = text;
        this.answer = answer;
        this.difficulty = difficulty;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }
}

class Quiz {

    private ArrayList<Question> quiz = new ArrayList<Question>();
//    Quiz() {}

    public void print() {
        for (int i = 0; i < quiz.size(); i++) {
            System.out.println(i + ". " + quiz.get(i).getText());
        }
    }
    public void add_question() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the question Text?");
        String txt = scan.nextLine();
        System.out.println("What is the Answer?");
        String answer = scan.nextLine().toUpperCase();
        System.out.println("How Difficult (1-3)?");
        int diff = scan.nextInt();
        while (!(diff > 0 && diff < 4)) {
            System.out.println("ERROR: Give integer between 1 and 3");
            System.out.println("How Difficult (1-3)?");
            diff = scan.nextInt();
        }

        quiz.add(new Question(txt, answer, diff));
    }

    public void remove_question() {
        Scanner scan = new Scanner(System.in);
        if (quiz.size() > 0) {
            System.out.println("Choose the question to remove?");
            print();
            int num = scan.nextInt();
            quiz.remove(num);
        } else {
            System.out.println("There are no questions to remove");
        }
    }

    public void modify_question() {
        Scanner scan = new Scanner(System.in);
        if (quiz.size() > 0) {
            System.out.println("Choose the question to modify?");
            print();
            int num = scan.nextInt();
            scan.nextLine();
            System.out.println("What is the question Text?");
            String txt = scan.nextLine();
            quiz.get(num).setText(txt);
            System.out.println("What is the Answer?");
            String answer = scan.nextLine().toUpperCase();
            quiz.get(num).setAnswer(answer);
            System.out.println("How Difficult (1-3)?");
            int diff = scan.nextInt();
            while (!(diff > 0 && diff < 4)) {
                System.out.println("ERROR: Give integer between 1 and 3");
                System.out.println("How Difficult (1-3)?");
                diff = scan.nextInt();
            }
            quiz.get(num).setDifficulty(diff);
        } else {
            System.out.println("There are no questions to modify");
        }
    }

    public void give_quiz() {
        Scanner scan = new Scanner(System.in);
        int correct = 0;
        if (quiz.size() > 0) {
            for (int i = 0; i < quiz.size(); i++) {
                System.out.println(quiz.get(i).getText());
                String ans = scan.nextLine().toUpperCase();
                if (ans.equals(quiz.get(i).getAnswer())) {
                    System.out.println("Correct");
                    correct++;
                } else {
                    System.out.println("Incorrect");
                }
            }
            System.out.println("You got " + correct + " out of " + quiz.size());
        } else {
            System.out.println("There are no questions to give");
        }
    }
}
