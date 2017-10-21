import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int answer = 0;

        System.out.println("Tell me a number and I'll get the sum or product of it!");
        int inputNumber = scanner.nextInt();
        System.out.println();
        System.out.println("Would you like me to compute the sum or product?\nEnter 1 for sum!\nEnter 5 for product!");
        int action = scanner.nextInt();
        if(action == 1){
            answer = addition(inputNumber);
        }else if( action == 5){
            answer = multiplication(inputNumber);
        }
        System.out.println("Your answer is " +answer +"!");

    }

    public static int addition(int input) {
        int sum = 0;
        for(int x = 1; x <= input; x++ ){
            sum = sum + x;}

        return sum;

    }

    public static int multiplication(int input) {
        int sum = 1;
        for(int x = 1; x <= input; x++ ){
            sum = sum * x;}

        return sum;

    }
}
