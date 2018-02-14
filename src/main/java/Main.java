/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        System.out.println("Welcome to 'Factorial Fun'\nDo you want the sum or product of all numbers under yours? Enter 1 for sum, 2 for product");
        Scanner input = new Scanner(System.in);
        int whatDoesTheUserWantToDo = input.nextInt();
        System.out.println("And what's yo numbah baby?");
        int numberInQuestion = input.nextInt();
        if (whatDoesTheUserWantToDo == 1){
            int finalSum = 0;
            for (int i = numberInQuestion; i > 0; i--) {
                finalSum += i;
            }
            System.out.println("Here's your sum: " + finalSum);
        } else if (whatDoesTheUserWantToDo == 2) {
            int finalProduct = 1;
            for (int i = 2; i <= numberInQuestion; i++) {
                finalProduct *= i;
            }
            System.out.println("Here's your product: " + finalProduct);
        } else {
            System.out.println("Come on man just play by the rules");
        }

    }

}
