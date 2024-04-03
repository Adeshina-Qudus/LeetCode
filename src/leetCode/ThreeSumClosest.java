package leetCode;

public class ThreeSumClosest {
    public static int threeSumClosest(int[] input,int target) {

        int sumTemp = 0;
        int result = 0;
        int sum = 0;
        int countingNumbersSumTogether = 0;
        for (int count = 0 ; count < input.length;count++){
            for (int counter = 0 ; counter < input.length; counter++){
                countingNumbersSumTogether++;
                sum += input[counter];
                if (countingNumbersSumTogether == 3) {
                    counter = count;
                    break;
                }
            }
            if (sum < sumTemp){
                result = sum;
            }
            sumTemp = sum;
            sum = 0;
        }
        return result;
    }
}
