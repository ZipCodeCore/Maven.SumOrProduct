import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
         System.out.println("please enter a number");
         int numb = scan.nextInt();
         int sum = 0;
         int product = 1;
         System.out.println("Enter 1 for sum your number 2 for product");
         int number = scan.nextInt();

         if(number == 1) {
             //int sum = 0;
             for (int i = 0; i <= numb; i++) {
                 sum = sum + i;
             }
             System.out.println("This is the Sum:" + sum);
         }

         else {
             for (int i = 1; i <= numb; i++) {
                 product = product * i;
             }
             System.out.println("This is the Product:" + product);
         }
    }
}
