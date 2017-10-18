import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        int total = 0;
        int input;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Enter a number >>");
            input = in.nextInt();
        }while(input<=0);
        System.out.println("Would you like the product or the sum off all the numbers before "+input+ "? >>");
        String  productSum = in.next();
        if("product".equalsIgnoreCase(productSum)){
            total = 1;
            for (int i = 1; i <= input; i++) {
                total = total * i;
            }
        }else if ("sum".equalsIgnoreCase(productSum)){
            for (int i = 1; i <= input; i++) {
                total += i;
            }
        }else{
            System.out.println("Not a valid input");
        }
        System.out.println(total);
    }
}
