import java.util.Scanner;

/**
 * 10. Write a program to input any number and check if it Armstrong number or not
 */
public class Programme10_ArmstrongNumber {
    public static void main(String[] args) {
        int n, count = 0, a, b, c, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        n = s.nextInt();
        a = n;
        c = n;
        while (a > 0) {
            a = a / 10;
            count++;
        }
        while (n > 0) {
            b = n % 10;
            sum = (int) (sum + Math.pow(b, count));
            n = n / 10;
        }
        if (sum == c) {
            System.out.println(c + "is an Armstrong Number");
        } else {
            System.out.println(c + "is not an Armstrong number");
            s.close();
        }
    }


}
