/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number: ");
<<<<<<< HEAD
        int personNum = input.nextInt();

        System.out.println("Would you like to add or multiply? ");
        String computeInput = input.next();
=======
        String userInput = input.nextLine();

        System.out.println("Would you like to add or multiply? ");
        String computeInput = input.nextLine();
>>>>>>> f4f28d38976360eb699a92cc8d69d0c2bfefcb0f

        if(computeInput.equalsIgnoreCase("add")) {
            int sum = 0;

            for (int i = 1; i <= personNum; i++) {
                sum += i;
             }
             System.out.println(sum);
        } else if (computeInput.equalsIgnoreCase("multiply")) {
            int multTotal = 1;

            for (int i = 1; i <= personNum; i++) {

                multTotal *= i;
            }
            System.out.println(multTotal);

        }


}
}
