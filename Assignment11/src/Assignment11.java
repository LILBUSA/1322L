import java.util.*;
import java.io.*;

public class Assignment11 {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a file name: ");
            File file = new File(scan.nextLine());
            Scanner fileScan = new Scanner(file);

            int lineCount = 0;
            int wordCount = 0;
            int charCount = 0;
            while (true) {
                if (fileScan.hasNextLine()) {
                    lineCount++;
                    String line = fileScan.nextLine();
                    String[] words = line.split(" ");
                    wordCount += words.length;
                    for (int i = 0; i < words.length; i++) {
                        for (int j = 0; j < words[i].length(); j++) {
                            char c = words[i].charAt(j);
                            if (!(c == '.' || c == ',')) {
                                charCount++;
                            }
                        }
                    }
                } else {
                    break;
                }
            }
            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Chars: " + charCount);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
