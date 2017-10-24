import java.util.Scanner;

public class Main {

    static String choiseUserInput;

    public static void main(String[] args) {

        OperationSelector operationSelector = new OperationSelector();

        System.out.println("Write a number");

        Scanner scanner = new Scanner(System.in);

        int numberUserInput = scanner.nextInt();

        System.out.println("Would like the sum or the product from 1 to " + numberUserInput + " ???, press '+' for sum or '*' for multiplication");

        do {

            choiseUserInput = scanner.next();


            if (choiseUserInput.equalsIgnoreCase("+")) {

                operationSelector.sumCalculation(numberUserInput);

            } else if (choiseUserInput.equalsIgnoreCase("*")) {

                operationSelector.productCalculation(numberUserInput);

            } else {
                System.out.println("Wrong choice, please select either ''+'' sign or ''*'' sign");

            }
        }while(!choiseUserInput.equalsIgnoreCase("+")||(!choiseUserInput.equalsIgnoreCase("*")));
    }
}