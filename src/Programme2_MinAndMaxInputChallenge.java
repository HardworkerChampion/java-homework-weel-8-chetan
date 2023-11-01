import java.util.Scanner;

public class Programme2_MinAndMaxInputChallenge {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int num1, num2, max, min;
        System.out.print("enter a number: ");
        num1 = input.nextInt();
        System.out.print("enter another number: ");
        num2 = input.nextInt();
        max = Math.max(num1, num2);
        min = Math.min(num1, num2);


        while (num2 != -99) {
            System.out.print("enter a number or -99 to stop: ");
            num2 = input.nextInt();
            if (num2 != -99) {
                max = Math.max(max, num2);
                min = Math.min(min, num2);
            }

        }
        System.out.println("largest is: " + max);
        System.out.println("Smallest is: " + min);
    }
}