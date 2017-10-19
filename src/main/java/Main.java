import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sumOfNumbers = 0;
        int productOfNumbers = 1;

        System.out.println("Pick any positive number from 1 or greater.");
        String input = scanner.nextLine();
        int intInput = Integer.parseInt(input);
        while (intInput < 1) {
            System.out.println("Invalid choice. Pick any positive number from 1 or greater.");
            input = scanner.nextLine();
            intInput = Integer.parseInt(input);
        }

        System.out.println("Would you like to Multiply or Add? (m/a)");
        String mathOperation = scanner.nextLine();
        while (!(mathOperation.equals("m") || mathOperation.equals("a"))) {
            System.out.println("Invalid choice, pick 'm' or 'a'.");
            mathOperation = scanner.nextLine();
        }

        if (mathOperation.equals("a")) {
            for (int i = 1; i <= intInput; i++) {
                sumOfNumbers += i;
            }
            System.out.println(sumOfNumbers);
        } else if (mathOperation.equals("m")) {
            for (int i = 1; i <= intInput; i++) {
                productOfNumbers *= i;
            }
            System.out.println(productOfNumbers);
        }


    }
}
