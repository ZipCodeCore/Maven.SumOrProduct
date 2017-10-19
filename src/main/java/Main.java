import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int number;
        int numSum = 0;
        long numProd = 1;
        String choice = new String("");

        System.out.println("Enter a number:");

        Scanner inputNum = new Scanner(System.in);
        number = inputNum.nextInt();

        System.out.println("Sum or Product? ");

        Scanner inputSumProd = new Scanner(System.in);
        choice = inputSumProd.nextLine();

        if("sum".equals(choice)) {

            for (int i = 0; i <= number; i++) {
                numSum += i;
            }

            System.out.println(numSum);

        }

        else if ("product".equals(choice)){

            for (int i = 1; i <= number; i++) {
                numProd *= i;

            }

            System.out.println(numProd);

        }



}
}
