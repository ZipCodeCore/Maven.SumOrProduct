/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Press 1 for SUM or 2 for PRODUCT of a number:");
        int choice1 = input.nextInt();

        if (choice1 == 1) {
            System.out.println("Please enter a number to calculate the cumulative sum:");
            int choice2 = input.nextInt();
            System.out.println(Main.sumNumbers(choice2));

        }
        else if (choice1 == 2) {
            System.out.println("Please enter a number to calculate the cumulative product:");
            int choice2 = input.nextInt();
            System.out.println(Main.productNumbers(choice2));

        }

    }

    public static int sumNumbers (int n) {
        int sum = 0;
        for (int i=1; i<=n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int productNumbers (int n) {
        int product = 1;
        for (int j=1; j<=n; j++) {
        product = product*j;
        }

        return product;
    }

}
