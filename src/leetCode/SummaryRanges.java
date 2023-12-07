package leetCode;

import java.util.ArrayList;

public class SummaryRanges {

    public static String[] summaryRanges(int[] inputArray) {
        ArrayList<String> result = new ArrayList<>();
        result.add(""+inputArray[0]);
        for (int outter = 0 ; outter < inputArray.length; outter += 2){
            if (inputArray[outter] % inputArray[outter+1] != 1){
                
            }
        }
    }
}
