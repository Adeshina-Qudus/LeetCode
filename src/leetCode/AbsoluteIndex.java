package leetCode;

import java.util.ArrayList;

public class AbsoluteIndex {


    public static int absoluteIndex(int[] inputArray, int x, int y) {
        ArrayList<Integer> integers = new ArrayList<>();
        int indexOfX = 0 ;
        int indexOfy = 0;
        int result;
        for (int count = 0; count < inputArray.length; count++) {
            if (inputArray[count] == x) {
                indexOfX = count;
            }
            if (inputArray[count] == y) {
                indexOfy = count;
            }
            result = indexOfX - indexOfy;
            integers.add(result);
        }
        return resultOfAbsolute(integers);
    }
    private static int resultOfAbsolute(ArrayList<Integer> integers) {
        int result = 0 ;
        for (int count = 1 ; count < integers.size(); count++){
            result += integers.get(count - 1) - integers.get(count);
        }
        if (result < 1){
            result = result * -1;
        }
        return result;
    }
}
