import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        {
            Scanner number = new Scanner(System.in);
            Scanner string = new Scanner(System.in);
            int count = 0;
            int countM = 1;

            System.out.println("Enter a number");

            int numberInput = number.nextInt();

            System.out.println("Would you like to multiply or add?");

            String stringInput = string.nextLine();

            if (stringInput.equals("add")) {
                for (int i = 0; i <= numberInput; i++) {
                    count = i + count;

                }
                System.out.println("Sum of your input is: " + count);

            } else if (stringInput.equals("multiply")) {
                    for (int i = 1; i <= numberInput; i++) {
                        countM = i * countM;


                    }
                System.out.println("The product is: " + countM);
                }

            }

        }
    }
