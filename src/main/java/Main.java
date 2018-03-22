import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pref;
        boolean isValid = false;
        do {
            System.out.println("Would you like me to Multiply or Add for you?");
            pref = input.nextLine();
            if (isAdd(pref) == true) {
                isValid = true;
                System.out.println("Please input an integer for me to add");
                int number = input.nextInt();
                System.out.println("The sum of all integers between 1 and " + number + " is: \n" + quickAdd(number));
                System.out.println("Quick Maffs");
            } else if (isMultiply(pref) == true) {
                isValid = true;
                System.out.println("Please input an integer for me to multiply");
                long number = input.nextLong();
                System.out.println("The product of all integers between 1 and " + number + " is: \n" + quickMultiply(number));
                System.out.println("Quick Maffs");
            } else {
                System.out.println("Invalid input.  Please try again:");
            }
        }
        while (isValid == false) ;
    }


    public static boolean isMultiply(String pref){
        return pref.equals("Multiply") || pref.equals("multiply");
    }

    public static boolean isAdd(String pref){
        return pref.equals("Add") || pref.equals("add");
    }

    public static int quickAdd (int number){
        int answer = 0;
        for (int i = 1; i <= number; i++){
            answer = answer +i;
        }
        return answer;
    }

    public static long quickMultiply (long number){
        long answer = 1;
        for (int i = 1; i <= number; i++){
            answer = answer * i;
        }
        return answer;
    }

}
