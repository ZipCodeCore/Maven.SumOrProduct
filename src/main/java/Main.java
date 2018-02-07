/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userInt;
        int userChoice;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter an integer (don't get crazy...): ");
            userInt = in.nextInt();

            System.out.println("\nChoose one of the following: ");
            System.out.println("\t1 = Sum");
            System.out.println("\t2 = Product");
            System.out.println("Press any other key to quit.");

            userChoice = in.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.println("Sum: " + add(userInt));
                    break;
                case 2:
                    System.out.println("Product: " + multiply(userInt));
                    break;
            }
        }while(userChoice < 2 && userChoice > 1);
        System.out.println("byebye");
    }

    public static Integer add(int input) {
        int sum = 0; //probably should validate against overflow...if there's time
        for (int i = 1;i<=input;i++) {
           sum += i;
        }
        return sum;
    }

    public static Integer multiply(int input) {
        int product = 1;
        for (int i=1;i<=input;i++) {
            product *= i; //this definitely should be protected against overflow..
        }
        return product;
    }
}
