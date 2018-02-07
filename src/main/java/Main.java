/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type your number here fool:");
        int n = in.nextInt();
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want sum or product of your number?");
        String operator = scan.nextLine();

        if (operator.equalsIgnoreCase("sum")) {
            int hold = 0;
            for (int x = 0; x <= n; x++) {
                hold = hold + x;
            }
            System.out.println("The sum of your number is: " + hold);
        } else if (operator.equalsIgnoreCase("product")) {
            int fall = 1;
            for (int y = 1; y <= n; y++) {
                fall = fall * y;
            }
            System.out.println("The product of your number is: " + fall);
        }
    }
}
