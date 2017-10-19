import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        System.out.println("Input any number");
        int n = number.nextInt();

        Scanner operation = new Scanner(System.in);
        System.out.println("Input \"sum\" or \"product\"" + "\t:Without quotes");
        String o = operation.nextLine();


        if("sum".equals(o)){

            int sum = 0;

            for (int i = 0; i <= n; i++) {
                sum += i;

            }System.out.println(sum);

        }else if("product".equals(o)){

            int product = 1;

            for (int i = 1; i <= n; i++) {
                product *= i;

            }System.out.println(product);

        }
    }

}
