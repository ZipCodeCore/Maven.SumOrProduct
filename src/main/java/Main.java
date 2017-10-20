import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Give me another number.");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
// Tried to declare all my variables in one spot. Not sure if good idea will ask about later.

        int result = 0;


// Not sure if missing something above will have to check back.



        System.out.println(" Okay time to switch it up. Do you want me to multiply or add?");

        String wantProductOrSum = scanner.next();
        if ("multiply".equalsIgnoreCase(wantProductOrSum)){
            result++;
            for (int i = 1; i <= number; i++) {
                result = i * result;

                System.out.println(i);
            }



        } else if ("add".equalsIgnoreCase(wantProductOrSum)){
            for (int i = 1; i <= number; i++) {
                result = i + result;

                System.out.println(i);
            }


        } else {
            System.out.println("go away");
        }
            System.out.println(result);
    }
}