import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public int sumOfOneToN(int num, String choice){
        int sumTotal = 0;
        int productTotal = 1;
        int answer = 0;
        if (choice.equals("sum")){
            for (int i = 1; i <= num; i++) {
                sumTotal += i;
            }
            answer += sumTotal;
            System.out.println("The sum of the numbers 1 to " + num +" is " +sumTotal);
        }
        else if (choice.equals("product")) {
            for (int k = 1; k <= num; k++) {
                productTotal *= k;
            }
            answer += productTotal;
            System.out.println("The product of the numbers 1 to " + num +" is " +productTotal);
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int userNum = userInput.nextInt();
        System.out.println("Please enter 'sum' or 'product' :");
        String userChoice = userInput.next();

        Main main = new Main();
        main.sumOfOneToN(userNum, userChoice);
    }
}
