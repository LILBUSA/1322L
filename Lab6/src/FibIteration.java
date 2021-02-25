import java.util.ArrayList;
public class FibIteration implements FindFib {
    public int calculateFib(int n) {
        ArrayList<Integer> sequence = new ArrayList<>();
        sequence.add(0);
        sequence.add(1);
        if (n == 1) {
            return 1;
        } else {
            for (int i = 1; i < n + 1; i++) {
                int result = sequence.get(i) + sequence.get(i - 1);
                sequence.add(result);
            }
        }
        return sequence.get(n);
    }
}
