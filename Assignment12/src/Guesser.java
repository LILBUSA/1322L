import java.util.Random;

public class Guesser implements Runnable {
    public int threadID;
    public static int nextThreadID = 0;
    public int guesses;

    public Guesser() {
        threadID = nextThreadID;
        nextThreadID++;
    }

    @Override
    public void run() {
        Random rand = new Random();

        while (rand.nextInt(1000000) != 123456) {
            guesses++;
        }

        System.out.println("I'm thread " + threadID + ", I just found the number on guess " + guesses);
    }
}
