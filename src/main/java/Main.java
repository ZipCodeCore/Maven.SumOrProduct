import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Would you like to multiply (type m) or sum (type s)");
        scanner.nextLine();
        String response = scanner.nextLine();
        if ("m".equalsIgnoreCase(response)) {
            System.out.println("The multiplited sum of 1 to " + number + " is " + multiply(number));
        }
        else if ("s".equalsIgnoreCase(response)) {
            System.out.println("The sum of 1 to " + number + " is " + add(number));
        }


    }

    public static int multiply(int number) {
        int sum = 1;
        for (int i = 1; i <= number; i++) {
            sum = sum * i;
        }
        return sum;
    }

    public static int add(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
