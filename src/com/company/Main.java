package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please, pick a number! I'm going to " +
                "take your number, and store it to a variable, " +
                "called 'n'.");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;

        System.out.println("I'll give you two choices now. You " +
                "may either multiply or add 'n' " +
                "to the number of all integers between 1 and n. Just" +
                " type 'add' or 'multiply'");

        String ans = in.next();

        if ("multiply".equalsIgnoreCase(ans)){
            sum++;
            for (int i = 1; i <= n; i++){
                sum = sum * i;
                System.out.println(sum);
            }
        }
        else if ("add".equalsIgnoreCase(ans)){
            sum++;
            for (int i = 1; i <= n; i++){
                sum = sum + i;
                System.out.println(sum);

            }
        }

        else if (ans != "add" && ans != "multiply") {
            System.out.println("fuck you.");
        }
        System.out.println("Your sum is:" + sum +
                ". What an awesome sum. Good job!");
    }
}
