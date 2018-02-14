/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.*;
public class Main {

    public static void main(String[] args){
        int result=0;
        Scanner input = new Scanner(System.in);
        System.out.println(" please enter a number and I willl give you the sum or product of numbers between 1 and the " +
                "number you put");
        int inputNumber = input.nextInt();
        input.nextLine();
        System.out.println("would you like a sum or a product?");
        String inputAnswer = input.nextLine();
        if(inputAnswer.equalsIgnoreCase("Sum")){
            for(int i = 1;i<=inputNumber;i++){
                result+=i;
            }
        }else{
            result+=1;
            for(int j =1;j<=inputNumber;j++){
                result*=j;
            }
        }
        if(inputAnswer.equalsIgnoreCase("sum")){
            System.out.println("The sum of the integers from 1- "+ inputNumber+ " is "+ result);
        }else {
            System.out.println("The product of the integers from 1- "+ inputNumber+ " is "+ result);
        }

    }

}
