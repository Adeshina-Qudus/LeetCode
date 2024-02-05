package leetCode;

import java.util.ArrayList;

public class LowestInTwoArray {


    public static int lowestInTwoArray(int[] inputArray, int[] input) {
        ArrayList<Integer> lowestInTwoArray = new ArrayList<>();
        for (int firstLoop = 0; firstLoop < inputArray.length; firstLoop++){
            for (int secondLoop = 0; secondLoop < input.length; secondLoop++){
                if (inputArray[firstLoop] == input[secondLoop]){
                    lowestInTwoArray.add(inputArray[firstLoop]);
                }
            }
        }
        return lowest(lowestInTwoArray);
    }

    private static int lowest(ArrayList<Integer> lowestInTwoArray) {
        int result = 0 ;
        int smallest = lowestInTwoArray.get(0);
        for (int loop = 0; loop < lowestInTwoArray.size(); loop++){
            if (lowestInTwoArray.get(loop) <= smallest){
                result = lowestInTwoArray.get(loop);
            }
        }
        return result;
    }
}
