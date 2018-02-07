import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a whole number: ");
        int input = scan.nextInt();

        Scanner scan2 = new Scanner(System.in);

        System.out.println("Sum or Product?");
        String op = scan2.nextLine();

        int sum = 0;
        int product = 1;

        if(op.equals("Sum")) {
            for (int i = 1; i <= input; i++) {
                sum += i;
            }
            System.out.println(sum);
        } else if(op.equals("Product")) {
            for(int i = 1; i <= input; i ++) {
                product *= i;
            }
            System.out.println(product);
        }
    }
}

