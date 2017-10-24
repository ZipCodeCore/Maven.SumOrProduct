import java.awt.peer.SystemTrayPeer;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int result = 0;

        System.out.println("Please input a number n:");

        int number = input.nextInt();

        System.out.println("Do you want 'sum' or 'product' from 1 to n?");

        String operation = input.next();

        if ("sum".equalsIgnoreCase(operation)) {
            result = 0;
            for (int i = 1; i <= number; i++) {
                result += i;
            }
        } else if ("product".equalsIgnoreCase(operation)) {
            result = 1;
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
        } else {System.out.println("Beep boop does not compute command!");}

        System.out.printf("You chose to '%s' the number %d. The result = %d.", operation, number, result);

    }
}
