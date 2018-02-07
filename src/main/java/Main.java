/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanNum = new Scanner(System.in);
        Scanner scanString = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int userNumber = scanNum.nextInt();

        System.out.println("Would you like to multiply or add " + userNumber + " to 1.... please enter multiply or add: ");

        String userString = scanString.nextLine();

        if (userString.equals("add")) {
            System.out.println("Your total is: " + (userNumber + 1));
        } else if (userString.equals("multiply")) {
            System.out.println("Your total is: " + (userNumber * 1));
        }

    }
}
