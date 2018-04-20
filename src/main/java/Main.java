import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        int n;

        Scanner scanner = new Scanner(System.in);

        // Number request
        do {
            System.out.print("Please enter a whole number greater than zero: ");
            String inputString = scanner.next();
            try {
                n = Integer.parseInt(inputString);
                //System.out.println("Correct int");
                if (n <= 0) continue;
                else break;
            } catch (NumberFormatException ne) {
                System.out.println("Input is not a whole number greater than zero.");
                System.out.println("Please try again.");
            }
        } while (true);


        // Sum or Product request
        String request;

        do {
            System.out.print("Enter either \"sum\" or \"multiply\" in lowercase: ");
            request = scanner.next(); //had to write .next() not .nextLine()

            if (request.equals("sum")) {
                break;
            } else if (request.equals("multiply")) {
                break;
            } else {
                System.out.println("You did not type \"sum\" or \"multiply\" in lowercase. Please try again.");
            }
        } while (!request.equals("sum") && !request.equals("multiply"));


        // Sum and Product
        int sum = 0;
        int product = 1;

        if (request.equals("sum")) { //SUM
            if (n > 1) {
                for (int i = 1; i <= n; i++) {
                    sum += i;
                }
                System.out.println("Sum is: " + sum);
            }
            else System.out.println("Sum is: " + n);
        } else { //PRODUCT
            if (n > 1) {
                for (int i = 1; i <= n; i++) {
                    product *= i;
                }
                System.out.println("Product is: " + product);
            }
            else System.out.println("Product is: " + n);
        }
    }
}
