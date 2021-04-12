import java.util.*;
import java.io.*;


public class Lab12 {
    public static void main(String[] args) {
        try {
            String[] txtLine = new String[2];
            File[] file = new File[] {new File("C:/Users/bigta/IdeaProjects/CSE 1322L/Lab12/assets/rn.txt"), new File("C:/Users/bigta/IdeaProjects/CSE 1322L/Lab12/assets/rightnow.txt")};
            Scanner[] scan = new Scanner[] {new Scanner(file[0]), new Scanner(file[1])};
            int lineNum = 0;
            while (scan[0].hasNextLine() || scan[1].hasNextLine()) {
                if (scan[0].hasNextLine() && scan[1].hasNextLine()) {
                    lineNum++;
                    txtLine[0] = scan[0].nextLine();
                    txtLine[1] = scan[1].nextLine();
                    if (!(txtLine[0].equals(txtLine[1]))) {
                        System.out.println("Line " + lineNum + "\n<" + txtLine[0] + "\n>" + txtLine[1]);
                    }
                } else {
                    System.out.println("Files have different number of lines");
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
