package global.goit;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumCalculator {

    public static void main(String[] args) {
        int numUser;
        SumCalculator sumCalculator = new SumCalculator();
        numUser = sumCalculator.scanUserInput();
        System.out.println(sumCalculator.sum(numUser));
    }

    private int scanUserInput() {
        int userInput = -1;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println(" *** Please enter some number from 1 to maxInt :) inclusive.");
            try {
                userInput = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(" *** You entered Invalid data.");
                // To avoid the loop on the next iteration ! Because scan.nextByte() reads the same token again and throws the same exception again.
                scan.next();
            }
            if (userInput == 0) {
                throw new IllegalArgumentException();
            }
        } while (userInput < 0 || userInput >= Integer.MAX_VALUE);
        return userInput;
    }

    private int sum(int n) {

        return (n + n * n) / 2;
    }
}
