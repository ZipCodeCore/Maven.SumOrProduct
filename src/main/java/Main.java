/**
 * Created by Frankie!!!!!
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Sum or Product program");
        System.out.println();
        System.out.println();

        //init scanner
        Scanner input1 = new Scanner(System.in);

        //get input
        System.out.println("Please enter a max for our interval: ");
        int n = input1.nextInt();

        //multi or add?
        Scanner input2 = new Scanner(System.in);
        System.out.println("Would you like to Add or Multiply the numbers in this interval?");
        System.out.println("Reply 'a' for add and 'm' for multiply: ");
        String response = input2.nextLine();
        String add = "a";
        String multi = "m";
        int counter = 0;

        //condition statements
        if (response.equals(add)){
            for(int i = 1; i < n+1; i++) {
                counter += i;
            }
        }
        else if(response.equals(multi)){
            counter = 1;
            for(int i = n; i > 0; i--) {
                counter *= i;
            }
        }
        //print results
        System.out.println();
        System.out.println("Your total for your operation on the interval from 1 to " + n + " is " + counter);
    }
}
