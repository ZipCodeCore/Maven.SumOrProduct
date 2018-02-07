import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner userNumb = new Scanner(System.in);
        System.out.println("enter an integer");
        int number = userNumb.nextInt();
        Scanner aom = new Scanner(System.in);
        System.out.println("Would you like to add or multiply?");
        String addOrMult = aom.nextLine();
        int result = 0;
        if(addOrMult.equalsIgnoreCase("add")) {
            for(int i = 0; i<=number; i++) {
                result += i;
            }
        }
        if(addOrMult.equalsIgnoreCase("multiply")) {
            result = 1;
            for(int i = number; i>0; i--) {
                result *= i;
            }
            System.out.println("Your answer is " + result);

        }

    }
}
