/**
 * Created by iyasuwatts on 10/17/17.
 */

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println("Do you Want Sum or Product?");

        String name = in.nextLine();

        System.out.println("What Number Would You Like?");


        if ("Sum".equalsIgnoreCase(name)){

            int test = in.nextInt();

            int result = 0;

            for (int i = 0; i <= test; i++)

                result += i;

            System.out.println(result);
        }



        else if ("Product".equalsIgnoreCase(name)) {

            int test = in.nextInt();

            int result = 1;


            for (int i = 1; i <= test; i++)

                result *= i;

            System.out.println(result);
        }





    }

}
