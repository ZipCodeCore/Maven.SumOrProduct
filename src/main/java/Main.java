import java.util.Scanner;

/**
 * Created by Timothy Rager on 10/18/17.
 */
public class Main {

    private static void sumToUpperBound(int upperBound){
        int sum=0;
        for (int i=upperBound; i>0; i--)
        {
            sum+=i;
        }
        System.out.println("The sum from 1 to "+upperBound+" is "+sum);
    }

    private static void factorialToUpperBound(int upperBound){
        int product=1;
        for (int i=upperBound; i>0; i--)
        {
            product*=i;
        }
        System.out.println("The product from 1 to "+upperBound+" is "+product);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int upperBound=in.nextInt();
        in.nextLine();

        System.out.print("Do you wish to multiply or add? ");
        String sumOrAdd=in.nextLine();
        boolean invalidChoice=true;
        do
        {

            if ("add".equalsIgnoreCase(sumOrAdd))
            {
                sumToUpperBound(upperBound);
                invalidChoice=false;

            }
            else if ("multiply".equalsIgnoreCase(sumOrAdd))
                {
                    factorialToUpperBound(upperBound);
                    invalidChoice=false;

                }
                else
                {
                    System.out.print("Please choose either \"multiply\" or \"add\": ");
                    sumOrAdd=in.nextLine();
                }

        } while (invalidChoice);

    }
}
