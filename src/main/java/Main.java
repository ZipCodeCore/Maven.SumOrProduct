/**
 * Created by iyasuwatts on 10/17/17.

public class Main {

    public static void main(String[] args){

    }
}

 */


/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner amy = new Scanner(System.in);
        System.out.println("Dear user please choose a number.");
        int userNum = amy.nextInt();

        System.out.println("Hello dear user. Would you like to do some addition or some repeated addition? Please type" +
                " 'add' for addition and 'repeated add' for repeated addition. NO OTHER ANSWERS WILL BE ACCEPTED.");

        amy.nextLine();

        String userChoice = amy.nextLine();

        int count = 0;

        if (userChoice.equalsIgnoreCase("add")) {
            count = 0;

            // get sum
            for (int i = 1; i <= userNum; i++) {
                count += i;
            }
        } else if (userChoice.equalsIgnoreCase("repeated add")) {
            count = 1;
            // get product
            for (int i = 1; i <= userNum; i++) {
                count *= i;
            }


        }
        System.out.println(count);

    }
}


