import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String sumOrProduct;
        int userNumber = 0;
        int numberAdd = 0;
        int numberMultiply = 1;
        int numberStored = 0;



        System.out.println("What is your number?");
        userNumber = scanner.nextInt();
        System.out.println("Sum or Product");
        sumOrProduct = scanner.next();

        if (sumOrProduct.equalsIgnoreCase("sum")){
            for (int i = 1; i <= userNumber; i++) {
                numberAdd += i;
                numberStored = numberAdd;
            }
        }
        else if (sumOrProduct.equalsIgnoreCase("product")){
            for (int i = 1; i <= userNumber; i++) {
                numberMultiply *= i;
                numberStored = numberMultiply;
            }


        }

        System.out.println(numberStored);
    }
}
