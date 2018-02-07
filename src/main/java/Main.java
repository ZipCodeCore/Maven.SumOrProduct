import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number");
        String answer = number.nextLine();
        int givennumber = Integer.parseInt(answer);
        System.out.println(answer);

        Scanner chooseoption = new Scanner(System.in);
        System.out.println("would you like to add or multiply?");
        String addOrMultiply = chooseoption.nextLine();

        if (addOrMultiply.equalsIgnoreCase("add")) {
            int sum = 0;
            for (int i = 1; i <= givennumber; i++) {
                sum = sum + i;

            }
            System.out.println(sum);
        }
        else if (addOrMultiply.equalsIgnoreCase("multiply")){
            int product = 1;
            for (int i = 1; i <= givennumber; i++) {
                product = product * i;

            }
            System.out.println(product);
    }


    }
}







