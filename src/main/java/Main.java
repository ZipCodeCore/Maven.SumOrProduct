/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;


public class Main {

    // comment comment


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Scanner secondScan = new Scanner(System.in);

        System.out.println("Input a number");
        int input = scan.nextInt();
        int sumTotal = 0;
        int productTotal = 1;

        System.out.println("Would you like the sum or product of " + input + "?");
        String userInput = secondScan.nextLine();

        if (userInput.equalsIgnoreCase("sum")) {
            for (int i = 0; i <= input; i++) {
                sumTotal += i;
            }
            System.out.println("The sum of your number is " + sumTotal);

        } else if (userInput.equalsIgnoreCase("product")) {
            for (int i = 1; i <= input; i++) {
                productTotal *= i;

            }
            System.out.println("The product of your number is " + productTotal);
        } else {
            System.out.println("Invalid command, try again");
        }
    }


}