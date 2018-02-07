/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        String userInput = input.nextLine();

        System.out.println("Would you like to add or multiply? ");
        String computeInput = input.nextLine();

        if(computeInput.equalsIgnoreCase("add")) {

            int numInput = Integer.parseInt(userInput);
            int sum = 0;

            for (int i = 1; i <= numInput; i++) {

                sum += i;
             }
            System.out.println(sum);

        } else if (computeInput.equalsIgnoreCase("multiply")) {

            int numInput = Integer.parseInt(userInput);
            int sum = 1;

            for (int i = 1; i <= numInput; i++) {

                sum *= i;
            }
            System.out.println(sum);

        }


}
}
