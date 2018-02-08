

/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);



        System.out.println("Product or Sum");

        String productOrSum = stdin.next();
        System.out.println("Pick a number");
        Integer pickANumber = stdin.nextInt();
        int result = 1;



        if (productOrSum.equals("Product")) {
            for(int i = 1; i <= pickANumber; i++)
                result *= i;
            System.out.println(result);

        } else if (productOrSum.equals("Sum")) {
            for (int i = 1; i <= pickANumber; i++)
                result += i;

        System.out.println(result);

        }

        }


    }



