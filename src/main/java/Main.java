import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {
        //test
        //testtest
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int userNumber = scanner.nextInt();
        int product = 1;

        for (int i = 1; i <= userNumber; i++) {
            product *= userNumber;
            System.out.println(product);
        }
    }
}
