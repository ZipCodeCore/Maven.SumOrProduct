import java.util.*;
/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        System.out.println("Please enter a number:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Would you like the sum or product of 1 to this number?");
        Scanner or = new Scanner(System.in);
        String result = or.nextLine();
        int output = 1;
        //prints the sum or product of numbers from 1 to n depends on the users request
        for(int i=2;i<=n;i++){
            if("sum".equals(result)){
                output += i;
            }
            else{
                output = output *i;
            }

        }
        System.out.println(output);
    }
}
