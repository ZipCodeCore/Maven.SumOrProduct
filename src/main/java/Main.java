import java.util.Scanner;
/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        Scanner newScan = new Scanner(System.in);
        Scanner newScan2 = new Scanner(System.in);

        System.out.println("Enter 1 to Add, 2 to Multiply: ");

        int usrChoice = newScan2.nextInt();


        int numToCalc = 0;

        if (usrChoice == 1){
            System.out.print("Please enter a number to add: ");
            int usrNumber = newScan.nextInt();
           for(int x = usrNumber; x > 0; --x  )
            numToCalc +=x;
        } else {
            numToCalc = numToCalc + 1;
            System.out.print("Please enter a number to multiply: ");
            int usrNumber = newScan.nextInt();
           for(int x = usrNumber; x > 0; --x  )
               numToCalc *=x;
        }

       System.out.print("Your total is: " + numToCalc );
        }


    }
