package leetCode;

import java.util.ArrayList;

public class Hcf {


    public static int[] sort(int[] arrayInput) {
        for (int outter = 0; outter < arrayInput.length; outter++) {
            for (int inner = 0; inner < arrayInput.length; inner++) {
                if (arrayInput[outter] < arrayInput[inner]) {
                    int temp = arrayInput[inner];
                    arrayInput[inner] = arrayInput[outter];
                    arrayInput[outter] = temp;
                }
            }
        }
        return arrayInput;
    }
    public static int[] hcf(int[] inputArray) {
        sort(inputArray);
        ArrayList<Integer> divisorNumber = new ArrayList<>();
        int divisor = 2;
        int counterOf = 0;
        int max = max(inputArray);
        for (int count = 0 ; count < max; count++){
            divisor = getDivisor(inputArray, divisor, counterOf, divisorNumber);

        }
        return toArray(divisorNumber);
    }

    private static int getDivisor(int[] inputArray, int divisor, int counterOf, ArrayList<Integer> divisorNumber) {
        for (int counter = 0; counter < inputArray.length; counter++){
            if (inputArray[counter] % divisor == 0){
                counterOf++;
            }
            if (inputArray[counter] % divisor == 1){
                break;
            }
        }
        if (counterOf == inputArray.length){
            divisorFunction(inputArray, divisor);
            divisorNumber.add(divisor);
        }else {
            divisor++;
        }
        return divisor;
    }

    private static void divisorFunction(int[] inputArray, int divisor) {
        for (int count = 0 ; count < inputArray.length; count++){
            inputArray[count] = inputArray[count] / divisor;
        }
    }

    private static int max(int[] inputArray) {
       int min = inputArray[0];
       int max = 0;
        for (int element : inputArray) {
            if (element > min) {
                max = element;
            }
        }
        return  max;
    }

    private static int[] toArray(ArrayList<Integer> getDivisor) {
        int [] array = new  int[getDivisor.size()];
        for (int count = 0 ; count < getDivisor.size(); count++){
            array[count] = getDivisor.get(count);
        }
        return array;
    }

}
