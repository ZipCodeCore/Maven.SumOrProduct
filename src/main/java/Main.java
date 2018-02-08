import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner inputNum = new Scanner(System.in);
        System.out.println("Please input a number.");
        int userInput = inputNum.nextInt();
        System.out.println(userInput);
        Scanner userChoice = new Scanner(System.in);
        System.out.println("Would you like to add or multiply your number?");
        String userAnswer = userChoice.nextLine();
        int answer = 0;

        if (userAnswer.equals("add")) {
            for(int i=1; i <= userInput; i++) {
                answer+=i;
            }
        } else if (userAnswer.equals("multiply")) {
            for(int i=1; i <= userInput; i++) {
                answer*=i;
            }
        }
        System.out.println(answer);
    }
}
