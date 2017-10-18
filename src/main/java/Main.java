import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 * Edits by katherine on 10/18/17
 */
public class Main {

    public static void main(String[] args){
        int sum = 0;
        BigInteger product = BigInteger.valueOf(1);
        int highNumber = 0;
        int choice = 1;

        Scanner scan = new Scanner(System.in);
        boolean validInput = false;

        while(!validInput) {
            System.out.println("Please enter an integer greater than 0.");
            System.out.print(">> ");
            try {
                highNumber = scan.nextInt();

                if(highNumber > 0) {
                    validInput = true;
                }
                else {
                    System.out.println("Not a valid integer. Try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Not a valid integer. Try again.");
                scan.next();
                continue;
            }
        }

        validInput = false;
        System.out.printf("Do you want to to take the sum or the product of the first %d numbers?%n", highNumber);
        System.out.println("1) Sum");
        System.out.println("2) Product");
        while(!validInput) {
            System.out.println("Please enter 1 or 2");
            System.out.print(">> ");
            try {
                choice = scan.nextInt();

                if(choice == 1 || choice == 2) {
                    validInput = true;
                }
                else {
                    System.out.println("Not a valid entry. Try again.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Not a valid entry. Try again.");
                scan.next();
                continue;
            }
        }

        // compute sum if chosen
        if (choice == 1) {
            for (int i = 1; i <= highNumber; i++) {
                sum += i;
            }

            System.out.printf("The sum from 1 to %d is %d.%n", highNumber, sum);
        }

        // compute product if chosen
        else {
            for (int i = 1; i <= highNumber; i++) {
                product = product.multiply(BigInteger.valueOf(i));
            }

            System.out.printf("The product from 1 to %d is %d.%n", highNumber, product);
        }
    }
}
