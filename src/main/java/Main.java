import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like the sum or product?");
        String userChoice = scanner.nextLine();
        System.out.println("Enter a number.");
        int userNumber = scanner.nextInt();

        if (userChoice.equals("sum")) {
                int sum = 0;
                for(int i = 1; i <= userNumber; i++) {
                    sum += i;
                }
                System.out.println("The sum is " +sum );

            }else {
                int product = 1;
                for(int i = 1; i <= userNumber; i++) {
                    product *= i;
                }
                System.out.println("The product is " +product );
                }

            }

        }







