package global.goit;

public class SumCalculator {

    public int sum(int n) {
        return arithmeticProgression(n);
    }

    private int arithmeticProgression(int n) {
        if (checkValidInput(n)) {
            return (n + n * n) / 2;
        } else
            return -1;  // Return -1 as an example of invalid input.
    }

    private boolean checkValidInput(int n) {
        if (n == 0) {
            throw new IllegalArgumentException();
        } else
            return n > 0;
    }
}
