/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

public static int product =1;
public static int sum;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("What is your number? ");
        int n = in.nextInt();

        System.out.println("You have chosen: " + n);

        Scanner sumOrProduct = new Scanner(System.in);

        System.out.println("Please type in either sum or product");
        String choice = in.next();

        System.out.println("You have chosen: " + choice);
        // if choice is product
        // getProduct(n);
        /*
        if (!"sum".equalsIgnoreCase(choice) || !"product".equalsIgnoreCase(choice)) {
            // if choice is sum
            // getSum(n);
            System.out.println("Please input either sum or product");
            choice = in.next();
        }
        else {
        */
            while ("sum".equalsIgnoreCase(choice) || "product".equalsIgnoreCase(choice)) {
//                while (choice != "sum" || choice != "product") {
//                    System.out.println("Please input either sum or product");
//                    choice = in.next();

                if (choice.equalsIgnoreCase("product")) {
                    getProduct(n);
                    break;
                } else if (choice.equalsIgnoreCase("sum")) {
                    getSum(n);
                    break;
                }
            }
        }

    public static void getProduct(int n) {
        for (int i = 1; i <= n; i++) {
            product = product * i;
        }
        System.out.println("The product of 1 to your number is: " + product);
    }


    public static void getSum(int n) {
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("The sum of 1 to your number is: " + sum);

    }


}

