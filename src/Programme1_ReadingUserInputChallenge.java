import java.util.Scanner;

public class Programme1_ReadingUserInputChallenge {

    public static void main(String[] args) {
        int a = 1;

        Scanner input = new Scanner(System.in);


        System.out.println("Enter the number 1 : ");
        input.nextInt();


        int sum = 0;
        for (int i = 0; i < 10; i += 1) {
            sum += input.nextInt();

        }
        System.out.println("The total sum is " + sum);
        input.close();
    }
}
