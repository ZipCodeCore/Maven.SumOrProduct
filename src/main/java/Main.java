import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("What would you like to calculate? Product or Sum?");
        Scanner scanner = new Scanner(System.in);
        String prodOsum = scanner.nextLine();
        System.out.println("Enter your number");
        int n = scanner.nextInt();
    switch (prodOsum){
        case "product":
            int product = 1;
            for (int i = 1; i <= n; i++) {
                product*=i;
            }
            System.out.println(product);
            break;

        case "sum":{
            int sum = 0;
            for (int i = 0; i <= n; i++) {
                sum = sum + i;
            }
            System.out.println(sum);
        } break;
        default:
            System.out.println("Product or Sum please!");

    }
    }
}



