import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What number would you like to go up to?");
        int userNumInput = sc.nextInt();
        System.out.println("Would you like to 'sum' or 'multiply' the numbers?");
        String userCommand = sc.next();

        System.out.println(SumOrProduct(userNumInput, userCommand));
    }

    public static String SumOrProduct(int userNum, String userCommand){
        int sum = 0;
        int mult = 1;
        String answer = "";
        if ("sum".equals(userCommand)) {
            for (int x = 1; x <= userNum; x++) {
                sum += x;
            }
            answer += sum;
        } else if ("multiply".equals(userCommand)) {
            for (int x = 1; x <= userNum; x++) {
                mult *= x;
            }
            answer += mult;
        } else {
            answer += "Sorry that wasn't an option, you can choose 'sum' or 'multiply'," +
                    " not " + "'" + userCommand + "'.";
        }
        return answer;
    }
}

