import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static int summation(int n) {
        int result=0;
        for (int i=1; i<=n; i++){
            result+=i;
        }
        return result;
    }

    public static int factorial(int n) {
        int result =1;
        for (int i=1; i<=n; i++)
            result*=i;
        return result;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int n = in.nextInt();
        in.nextLine();

        System.out.print("Would you like the summation (S) or product (P) of your given number? ");
        String sumOrProd = in.nextLine();

        if ("s".equalsIgnoreCase(sumOrProd)) {
            System.out.println("The sum of the numbers from 1 to " + n + " is " + summation(n));
        } else if ("p".equalsIgnoreCase(sumOrProd)) {
            System.out.println("The product of the numbers from 1 to " + n + " is " + factorial(n));
        }

    }
}
