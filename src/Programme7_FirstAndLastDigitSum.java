/**
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 */

import java.util.Scanner;

public class Programme7_FirstAndLastDigitSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number pls :  " );
        scanner.nextInt();
        System.out.println(sumFirstAndLastDigit ( 123));
        scanner.close();
    }
    public static int sumFirstAndLastDigit(int number){
        if (number < 0){
            return -1;
        }
        int lastDigit = number % 10;
        while ( number >= 10){
            number /= 10;
        }
        return (number + lastDigit);
    }
}
