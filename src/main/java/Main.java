/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // TO DO:
        // Ask for an input value of integer n
        // Create a scanner to store to integer n and string choice of sum or product
        // Incorporate a switch statement for string choice
        // Input from the switch statement decides the method that will execute
        //

//-------------------------------------------------------------------------------------------------------------------

        // THIS IS 1 SCANNER WITH 2 INPUTS
        Scanner sn = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        String nAsAString = sn.nextLine();
        int n  = Integer.parseInt(nAsAString);



        System.out.println("Enter an option of \"sum\" or \"product: \"");
        String choice = sn.nextLine();

        int theSum = 0;
        int theProduct = 1;


        if (choice.equalsIgnoreCase("sum")) {
            for (int i = 0; i <= n; i++) {
                theSum += i;
            }

            System.out.println(theSum);
        } else if (choice.equalsIgnoreCase("product")) {
            for (int i = 1; i <= n; i++) {
                theProduct *= i;
            }

            System.out.println(theProduct);

        } else {

            System.out.println("You did not submit a valid choice");
        }

    }
}