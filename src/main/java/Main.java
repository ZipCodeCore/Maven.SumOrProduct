import java.util.Scanner;

public class Main {

    public static void main(String[] args){

 //first step
        System.out.println("Welcome to the Sum of Input Program! Type a number.");
        Scanner in = new Scanner(System.in);
        int inputNum = in.nextInt();

//variables to store the factorials
        int sum = 0;
        int product = 1;

//second step
        System.out.println("Now pick if you want a a sum or product.");
        Scanner scanWord = new Scanner(System.in);
        String choice = scanWord.nextLine();

//if... else if statement
        if("sum".equals(choice)) {

            for (int run = 1; run <= inputNum; run++) {
                System.out.println(run + " ");
                sum = sum + run;
            }
            System.out.println("The sum is  " + sum);
        }
        else if("product".equals(choice)){

            for (int number = 1; number <= inputNum; number++){
                product *= number;
            }
            System.out.println("The product is " + product );
          }
    }
}


