import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        Scanner userSumOrProduct = new Scanner(System.in);
        System.out.println("Do you want the sum or a product?");

        String answerOne = userSumOrProduct.nextLine().trim();

        System.out.println("Enter a number");

        int answerTwo = userSumOrProduct.nextInt();

        int result = 0;

        if (answerOne.equalsIgnoreCase("sum")) {
            for (int i=1; i <= answerTwo; i++){
                result += i;
            }

            System.out.println(result);

        } else if (answerOne.equalsIgnoreCase("product")) {
            result = 1;
            for (int i=1; i <= answerTwo; i++) {
                result *= i;
            }

            System.out.println(result);

        }

    }
}
