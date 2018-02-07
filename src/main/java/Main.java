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
        int j;
        int feederAnswer = 0;
        int feederProduct = 1;
        if (choice.equals("sum")){
            for (i = number; i > 0; i--){
                feederAnswer += i;
                //System.out.println(feederAnswer);
            }
            System.out.println("Your sum is " + feederAnswer);
        } else if (choice.equals("product")){
            for (j = number; j > 0; j--){
                //System.out.println(j);
                feederProduct = feederProduct * j;
                //System.out.println(feederProduct);
            }
            System.out.println("Your product is " + feederProduct);
        } else {
            System.out.println("Please select sum or product.");
        }
    }
}
