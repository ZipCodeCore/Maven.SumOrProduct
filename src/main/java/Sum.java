public class Sum {


    public static void find(int numberInput, int numberInput2) {
        for (int count = 0; count < numberInput2; count++) {
            numberInput += count;
        }
        System.out.println("The sum of all the numbers from 1 to " + numberInput2 + " is " + numberInput);

    }
}