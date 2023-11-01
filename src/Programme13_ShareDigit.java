/**
 * Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false
 */

import java.util.Scanner;

public class Programme13_ShareDigit {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Pls enter the number ");
        int s;
        s = scan.nextInt();
        System.out.println(hasSharedDigit(11,23));
        scan.close();
    }


    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if ((firstNumber < 10 || firstNumber > 99) || (secondNumber < 10 || secondNumber > 99)) {
            return false;
        }

        int testFirstNumber = firstNumber;
        int testSecondNumber = secondNumber;

        while (testFirstNumber != 0) {
            while (testSecondNumber != 0) {
                if ((testFirstNumber % 10) == (testSecondNumber % 10)) {
                    return true;
                }
                testSecondNumber /= 10;
            }
            testFirstNumber /= 10;
        }
        return false;
    }
}
