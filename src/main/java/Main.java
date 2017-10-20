import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {



    public static String getStringInput(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        String out = scanner.nextLine();
        return out;
    }

    public static int getIntInput(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        int out = scanner.nextInt();
        return out;
    }

    public static void main(String[] args) {

        int Result = 0;
        int Total = 0;
        int Product = 20;

        int num = getIntInput("Please enter a number: ");
        //System.out.println("Please pick a Sum or Product: "); //Pick

        String input = getStringInput("Please pick a Sum or Product: ").toUpperCase();


       if ("SUM".equals(input)) {
                for (int i = 1; i <= num; i++)
                    Result += i;
                System.out.println("Sum Of Input " + Result);
        } else if ("PRODUCT".equals(input)) {
            Result =1;
           for (int i = 1; i <= num; i++)
               Result *= i;
               System.out.println("Product Of Input " + Result);
        } else {
            System.out.println("Error Please pick Sum or Product");
            }

        }

    }


