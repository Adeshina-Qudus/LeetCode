package leetCode;

import java.util.ArrayList;

public class AddFirstTwoNumber {


    public static int[] addTwoNumbers(int[] inputArray) {
        ArrayList<Integer> resultList = new ArrayList<>();
        int total = 0;
        int counter = 1;
        for (int count = 0; count < inputArray.length; count++){
            total += inputArray[count];
            total = conditions(inputArray, counter, resultList, total, count);
            counter++;
        }
        return toArray(resultList);
    }

    private static int conditions(int[] inputArray, int counter, ArrayList<Integer> resultList, int total, int count) {
        if (counter % 2== 0){
            resultList.add(total);
            total = 0;
        }
        if (counter % 2 != 0 && count == inputArray.length - 1){
            resultList.add(inputArray[count]);
        }
        return total;
    }
    private static int[] toArray(ArrayList<Integer> resultList) {
        int [] resultArray = new int[resultList.size()];
        for (int count = 0 ; count < resultList.size(); count++){
            resultArray[count] = resultList.get(count);
        }
        return resultArray;
    }
}
