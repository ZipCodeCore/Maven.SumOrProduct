import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        System.out.println("Enter a number!");
        Scanner input = new Scanner(System.in);

        int userNumber = input.nextInt();

        System.out.println("Would you like sum or product: 1 = sum , 2 = product");

        int userChoice = input.nextInt();

        if(userChoice == 1){
            System.out.println(sum(userNumber));
        } else if (userChoice == 2){
            System.out.println(product(userNumber));
        }


    }

    public static int sum(int userNumber){

        int sum = 0;

        for (int i = 0; i <= userNumber; i++){
            sum+= i;
        }
        return sum;


    }
    public static int product(int userNumber){

        int product = 1;

        for (int i = 1; i <= userNumber; i++){
            product *= i;
        }
        return product;


    }







}
