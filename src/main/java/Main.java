package com.company;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Greetings, please enter a number below:") ;
        Scanner userInput = new Scanner(System.in) ;

        int userNumber = userInput.nextInt() ;

        System.out.println("Choose whether you would like a factorial sum or product? Please reply with 'sum' or 'product'");

        String userChoice = userInput.next() ;

        if (userChoice.equalsIgnoreCase("sum")) {

            long calcSum = 0 ;

            for (long i = 0 ; i <= userNumber ; i++) {

                calcSum += i ;

            }

            System.out.println(calcSum);

        }

        else if (userChoice.equalsIgnoreCase("product")) {

            long calcSum2 = 1;

            for (long i = 1 ; i <= userNumber ; i++) {

                calcSum2 *= i;

            }

            System.out.println(calcSum2);

        }

        else {System.out.println("You chose.... poorly");}

        }

    }

