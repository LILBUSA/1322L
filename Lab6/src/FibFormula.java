public class FibFormula implements FindFib {
    public int calculateFib(int n) {
        return (int)((Math.pow(((1+Math.sqrt(5))/2),n) - (Math.pow(((1-Math.sqrt(5))/2), n)))/Math.sqrt(5));
    }
}
