import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number");

        int n = scan.nextInt();

        System.out.println("sum or product? (enter '+' or '*' )");

        String operator = scan.next();

        while(!("+".equals(operator)) && !("*".equals(operator))){
            System.out.println("not a recognized operator, try again.");
            operator = scan.next();
        }


        if ("+".equals(operator)){

            int gaussian_sum = 0;


            for (int i=1 ; i < n+1; i++){
                // System.out.println("gaussian " + gaussian_sum + " i " + i);
                gaussian_sum += i;

            }

            System.out.println("gaussian sum = " + gaussian_sum);

        } else {

            int gaussian_prod = 1;


            for (int i=1 ; i < n+1; i++){
                //System.out.println("gaussian prod" + gaussian_prod + " i " + i);
                gaussian_prod *= i;

            }

            System.out.println("gaussian product = " + gaussian_prod);
        }




    }
}
