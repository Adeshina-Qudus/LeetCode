package leetCode;

public class ReturnNonDuplicateNumber {


    public static int nonDuplicateNumber(int[] inputArray) {
        int nonDuplicate = 0;
        int counter = 0;
        for (int outter = 0 ; outter < inputArray.length; outter++){
            counter = getCounter(inputArray, outter, counter);
            if (counter == 1){
                nonDuplicate = inputArray[outter];
            }
            counter = 0;
        }
        return  nonDuplicate;
    }

    private static int getCounter(int[] inputArray, int outter, int counter) {
        for (int inner = 0; inner < inputArray.length; inner++){
            if (inputArray[outter] == inputArray[inner]){
                counter++;
            }
        }
        return counter;
    }
}
