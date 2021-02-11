import java.util.ArrayList;
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Caesar salad = new Caesar();
        Scanner scan = new Scanner(System.in);
        int choice;

        do {
            out();
            choice = scan.nextInt();
            String str;
            switch(choice) {
                case 1:
                    System.out.println("What is the message to encrypt?");
                    str = scan.next().toLowerCase();
                    System.out.println("Encrypted: " + salad.encrypt(str));
                    break;
                case 2:
                    System.out.println("What is the encrypted message?");
                    str = scan.next().toLowerCase();
                    System.out.println("Plaintext: " + salad.decrypt(str));
                    break;
                case 3:
                    break;
                default:
                    System.out.println("ERROR: Please input an integer between 1 and 3");
            }
        } while(choice != 3);
    }

    public static void out() {
        System.out.println("1 Encrypt a message");
        System.out.println("2 Decrypt a message");
        System.out.println("3 Quit");
    }
}

class Caesar {
    ArrayList<Character> alphabet = new ArrayList<>();

    public Caesar() {
        for (char letter = 'a'; letter <= 'z'; letter++) {
            alphabet.add(letter);
        }
    }

    public int position_of_char(char c) {
        int num = 0;
        for (int i = 0; i < alphabet.size(); i++) {
            if (alphabet.get(i) == c) {
                num = i;
            }
        }
        return num;
    }

    public char letter_at_position(int num) {
        return alphabet.get(num);
    }

    public char encrypt_char(char c) {
        int num = position_of_char(c);
        num += 3;
        if (num >= 26) {
            num -= 26;
        }
        return letter_at_position(num);
    }

    public char decrypt_char(char c) {
        int num = position_of_char(c);
        num -= 3;
        if (num < 0) {
            num+= 26;
        }
        return letter_at_position(num);
    }

    public String encrypt(String str) {
        String ciphertext = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            c = encrypt_char(c);
            ciphertext += c;
        }
        return ciphertext;
    }

    public String decrypt(String str) {
        String ciphertext = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            c = decrypt_char(c);
            ciphertext += c;
        }
        return ciphertext;
    }
}
