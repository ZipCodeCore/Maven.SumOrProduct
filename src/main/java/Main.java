import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        // Ask user to enter a number n
        Scanner scanN = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double n = scanN.nextDouble();

        // Ask user whether they want to compute the Sum or the Product
        Scanner scanPorS = new Scanner(System.in);
        System.out.println("Would you like to compute the Sum or the Product?: ");
        String sumOrProd = scanPorS.nextLine();

        if (sumOrProd.equalsIgnoreCase("sum")) {

            int sumNum = 0;

            for (int i = 0; i <= n; i++) {

                sumNum += i;
            }

            System.out.println("The sum of 1 to " + n + " is: " + sumNum);
        }

        else {

            int productNum = 0;

            for (int i = 0; i <= n; i++) {

                productNum *= i;
            }

            System.out.println("The product of 1 to " + n + " is: " + productNum);
        }

    }
}
