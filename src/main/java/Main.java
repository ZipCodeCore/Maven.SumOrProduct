import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        /*I added Scanner check to allow the user to input in this particular program. Then I added a print statement
        so the user would know they had to type an integer. Created a variable to hold the number they selected. Then
        created a holder for the for loop which takes the total and gets the sum based on the last loop through.
         */
        Scanner check = new Scanner(System.in);
        System.out.println("Enter you number here: ");
        int n = check.nextInt();

        int total = 0;

        for (int i = 1; i <= n; i++){
            total = total + 1;

        }
        System.out.println(total);
    }
}
