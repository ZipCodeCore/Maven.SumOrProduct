import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your Number");
        int number = reader.nextInt();
        System.out.println("Sum or product?");
        String choice = reader.next();
        //now that we have number and choice, write an if or switch statement
        int i;
        int feederAnswer = 0;
        if (choice.equals("sum")){
            for (i = number; i > 0; i--){
                feederAnswer += i;
                System.out.println(feederAnswer);
            }
        } else if (choice.equals("product")){
            for (i = number; i > 0; i--){
                feederAnswer = feederAnswer * i;
                System.out.println(feederAnswer);
            }
        } else {
            System.out.println("Please select sum or product.");
        }
        System.out.println(feederAnswer);
    }
}
