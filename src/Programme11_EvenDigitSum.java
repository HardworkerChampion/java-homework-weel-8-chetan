import java.util.Scanner;

/**
 * 11.Even Digit Sum
 */
public class Programme11_EvenDigitSum {
    public static int getEvenDigitSum(int number){
        int lastDigit = 0;
        int evenDigitSum = 0;

        while (number!=0) {
            lastDigit = number % 10;
            if (lastDigit % 2 == 0)
                evenDigitSum += lastDigit;
        }
        number = number / 10;
    return evenDigitSum;
    }

    public static void main(String[] args) {
        int number = 0;
        int sumOfEvenDigits = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer number : : ");
        number = scan.nextInt();
        sumOfEvenDigits = getEvenDigitSum(number);
        System.out.println("The sum of even digits of " + "the number" + number + " = " + sumOfEvenDigits);
        scan.close();
    }
}
