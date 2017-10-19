


import java.util.Scanner;

/**
 *
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {
    /**
     *
     * @param prompt user String input
     * @return String
     */
    private static String getStringInput(String prompt) {  // the method saves user input into a string variable
        Scanner scanner = new Scanner(System.in);

        System.out.println(prompt);
        String input = scanner.nextLine();
        return input;
    }

    /**
     *
     * @param prompt  user input
     * @return    integer
     */
    private static int getIntInput(String prompt) {       // the method outbox the String  into integer
        return Integer.parseInt(getStringInput(prompt));
    }

    public static void main(String[] args) {
        int input = getIntInput("Insert number: ");
        String operation = getStringInput("Insert the operation you want to perform (please use 'add' or 'multiply' : ");
        double ans = 0;

        switch (operation.toUpperCase()) {

            case "ADD":

                for (int i = 1; i <= input; i++)
                    ans += i;
                System.out.println("The result is: " + ans);
                break;

            case "MULTIPLY":
                ans = ans+1;
                for (int i = 1; i <= input; i++)
                    ans *= i;
                System.out.println("The result is: " + ans);
                break;

            default:
                System.out.println("Please check your inputs");
                break;


        }


    }
}
