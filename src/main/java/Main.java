/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        promptUser(true);
    }

    public static void promptUser(boolean firstPrompt) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        int result = 0;

        int n = getNumber(input, firstPrompt);
        String operator = getOperator(input, firstPrompt);

        if (operator.equals("add"))
        {
            result = getSum(n);
        }

        if (operator.equals("multiply"))
        {
            result = getProduct(n);
        }

        System.out.println(result);
    }

    public static int getSum(int n) {
        int i = 1;
        int result = 0;

        while (i <= n)
        {
            result += i;
            i++;
        }

        return result;
    }

    public static int getProduct(int n) {
        int i = 1;
        int result = 1;

        while (i <= n)
        {
            result *= i;
            i++;
        }

        return result;
    }

    public static boolean isInteger(String s) {
        try
        {
            Integer.parseInt(s);
            return true;
        }
        catch (NumberFormatException ex)
        {
            return false;
        }
    }

    public static int getNumber(Scanner input, boolean firstPrompt) {
        int n = 0;
        if (firstPrompt)
        {
            System.out.println("Enter an integer.");
        }
        else {
            System.out.println("Please enter an integer.");
        }

        String s = input.nextLine();

        if (isInteger(s))
        {
            n = Integer.parseInt(s);
            return n;
        }
        else
        {
            return getNumber(input, false);
        }

    }

    public static String getOperator(Scanner input, boolean firstPrompt) {
        if (firstPrompt)
        {
            System.out.println("Would you like to add or multiply?");
        }
        else
        {
            System.out.println("Please choose add or multiply.");
        }

        String s = input.nextLine();

        if(!s.equals("add") && !s.equals("multiply"))
        {
            return getOperator(input, false);
        }

        return s;
    }
}
