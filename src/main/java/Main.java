import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int userNum = userInput.nextInt();
        System.out.println("Please enter 'sum' or 'product' :");
        String userChoice = userInput.next();
        int sumTotal = 0;
        int productTotal = 1;
        if (userChoice.equals("sum")){
            for (int i = 1; i <= userNum; i++) {
                sumTotal += i;
            }
            System.out.println("The sum of the numbers 1 to " + userNum +" is " +sumTotal);
        }
        else if (userChoice.equals("product")) {
            for (int k = 1; k <= userNum; k++) {
                productTotal *= k;
            }
            System.out.println("The product of the numbers 1 to " + userNum +" is " +productTotal);
        }
    }
}
