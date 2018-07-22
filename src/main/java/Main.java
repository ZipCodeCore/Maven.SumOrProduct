import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("Please enter a number.");
        int inputNumber = input.nextInt();
        int inputNumber2 = inputNumber;

        System.out.println("Would you like the sum or the product of this number? Press 1 for sum or 2 for product.");
        while (true){
            int choice = input.nextInt();
            if (choice == 1) {
                Sum.find(inputNumber, inputNumber2);
                break;
            } else if (choice == 2) {
                Product.find(inputNumber, inputNumber2);
                break;
            } else {
                System.out.println("Please enter 1 or 2 to select sum or product.");
            }
        }
    }
}
