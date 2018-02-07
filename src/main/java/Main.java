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

        System.out.println("Would you like to multiply or add " + userNumber + " between 1.... please enter multiply or add: ");

        String userString = scanString.nextLine();

        int totalSum = 0;

        if (userString.equals("add")) {
            for (int i = 0; i <= userNumber; i++) {
                totalSum += i;
            }

            System.out.println("Your added total is: " + (totalSum));

        } else if (userString.equals("multiply")){

            int totalProduct = 0;
                for (int x = 1; x <= userNumber; x++){
                    totalProduct = (userNumber * x) + totalProduct;
            }

            System.out.println("Your multiplied total is: " + totalProduct);


        }

    }
}
