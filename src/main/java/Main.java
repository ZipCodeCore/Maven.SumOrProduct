import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int num= scan.nextInt();
        System.out.println("Please enter 's' to sum 1-"+num+"\nPlease enter 'm' to multiply 1-"+num);
        String decMaker= scan.next();
        switch(decMaker){
            case "s":
                int sum= 0;
                for(int i=1;i<=num;i++)
                    sum+=i;
                System.out.println("Summed result "+sum);
                break;
            case "m":
                int mul=1;
                for(int i=1;i<=num;i++)
                  mul*=i;
                System.out.println("Multiplied result "+mul);
                break;
            default:
                System.out.println("Wrong entry press 's' or 'm'");
                break;
        }
    }
}
