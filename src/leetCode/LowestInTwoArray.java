package leetCode;

import java.util.ArrayList;

public class LowestInTwoArray {


    public static int lowestInTwoArray(int[] inputArray, int[] input) {
        ArrayList<Integer> lowestInTwoArray = new ArrayList<>();
        for (int firstLoopElement : inputArray) {
            for (int secondLoopElement : input) {
                if (firstLoopElement == secondLoopElement) {
                    lowestInTwoArray.add(firstLoopElement);
                }
            }
        }
        return lowest(lowestInTwoArray);
    }

    private static int lowest(ArrayList<Integer> lowestInTwoArray) {
        int result = 0 ;
        int smallest = lowestInTwoArray.get(0);
        for (Integer integer : lowestInTwoArray) {
            if (integer <= smallest) {
                result = integer;
            }
        }
        return result;
    }
}
