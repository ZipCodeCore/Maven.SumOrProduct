import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanInt = new Scanner(System.in);
        Scanner scanString = new Scanner(System.in);

        System.out.println("This is the Gaussian Wizardry. Please enter a number to receive your sum or product.");
        int num = scanInt.nextInt();
        int sum = 0;
        int prod = 1;


        while (true) {
            System.out.println("Please enter either a \"x\" for multiplication or a \"+\" for addition.");
            String calc = scanString.nextLine();

            if (!("x".equalsIgnoreCase(calc) || "+".equalsIgnoreCase(calc))) {
                System.out.println("You entered the wrong calculation.");
                continue;
            }
            if ("+".equalsIgnoreCase(calc)) {

                for (int i = 1; i <= num; i++) {
                    sum += i;
                }
                System.out.println("\nThe sum of your number using Gaussian Wizardry is " + sum + ".");
            }
            if ("x".equalsIgnoreCase(calc)) {

                for (int i = 1; i <= num; i++) {
                    prod *= i;
                }
                System.out.println("\nThe sum of your number using Gaussian Wizardry is " + prod + ".");
            }
            break;
        }

/*

        */
    }
    }

