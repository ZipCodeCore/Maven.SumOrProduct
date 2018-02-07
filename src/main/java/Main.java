import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int sumOfNumberEntered = 0;
        int prodOfNumberEntered = 1;

        System.out.println("Please enter any number.");
        int numberEntered = in.nextInt();

        System.out.println("Your number is " + numberEntered + ".  Please enter 'sum' or 'product'.");
        in.nextLine();
        //Scanner scan = new Scanner(System.in);
        String choice = in.nextLine();


        //while (numberEntered > 0) {
        if (choice.equalsIgnoreCase("sum")) {
            while (numberEntered > 0) {
                sumOfNumberEntered += numberEntered;
                numberEntered--;
            }
            System.out.println(sumOfNumberEntered);
        } else if (choice.equalsIgnoreCase("product")) {
            while (numberEntered > 0) {
                prodOfNumberEntered *= numberEntered;
                numberEntered--;
            }
            System.out.println(prodOfNumberEntered);
        } else if (!"sum".equalsIgnoreCase(choice) || !"product".equalsIgnoreCase(choice)){
                System.out.println("Invalid entry.  Program ended.");

            }

        }
        }

