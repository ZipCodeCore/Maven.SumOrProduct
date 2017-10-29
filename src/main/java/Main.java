import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {
//    Write a program which prompts the user to input a number, n.
//    The program should respond by printing the sum or product of the numbers 1 to n, contingent on user request.
//    Constraint: No Guassian wizardry !

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number.");
        int userNumber = scanner.nextInt();
        System.out.println("Would you like to find the sum or product of numbers 1 to your number? Please enter sum OR product.");
        Scanner sc = new Scanner(System.in);
        String userRequest = sc.nextLine();
        int sum = 0;
        int product = 1;

        if ("sum".equalsIgnoreCase(userRequest)) {
            for (int i = 1; i <= userNumber; i++) {
                sum += userNumber;
                System.out.println(sum);
            }
        }else if ("product".equalsIgnoreCase(userRequest)) {
            for (int i = 1; i <= userNumber; i++){
                product *= i;
                System.out.println(product);
            }
        }
    }
}
