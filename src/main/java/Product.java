public class Product {
    public static void find(int numberInput, int numberInput2) {
        for (int count = 1; count < numberInput2; count++) {
            numberInput = numberInput * count;
        }
        System.out.println("The product of all the numbers from 1 to " + numberInput2 + " is " + numberInput);

    }
}
