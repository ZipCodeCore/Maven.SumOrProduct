public class OperationSelector {

    public void sumCalculation(int value){

        int sum = 0;

        for(int i = 0;i<=value;i++){

            sum += i;
        }

        System.out.println(sum);
    }

    public void productCalculation(int value){

        int sum = 0;

        for(int i = 0;i<=value;i++){

            sum *= i;
        }

        System.out.println(sum);
    }

}
