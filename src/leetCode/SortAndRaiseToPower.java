package leetCode;

import java.util.Arrays;

public class SortAndRaiseToPower {
    public static int[] sortAndRaiseToPower(int[] arrayInput) {

        for (int outter = 0 ; outter < arrayInput.length; outter++){
            for (int inner = 0; inner < arrayInput.length; inner++){
                if (arrayInput[outter] < arrayInput[inner]){
                    int temp = arrayInput[inner];
                    arrayInput[inner] = arrayInput[outter];
                    arrayInput[outter] = temp;
                }
            }
        }
        return raiseOfItself(arrayInput);
    }
    private static int [] raiseOfItself(int[] array){
        for (int loop = 0; loop < array.length ; loop++){
            array[loop] = array[loop] * array[loop];
        }
        return array;
    }
}
