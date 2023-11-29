package leetCode;

import java.util.ArrayList;

public class FindFirstAndLastPositionOfElement {


    public static int[] firstAndLastPositionOfAElement(int[] array,int target) {
        ArrayList<Integer> resultArray = new ArrayList<>();
        for (int loop = 0 ;loop < array.length; loop++){
            if (array[loop] == target) {
                resultArray.add(loop);
                if (loop != array.length - 1) {
                    continue;
                }
            }
        }
        return listToArray(resultArray);
    }
    public static int [] listToArray(ArrayList<Integer> list){
        int[] array = new int[list.size()];
        for (int loop = 0 ; loop < array.length; loop++){
            array[loop] = list.get(loop);
        }
        return array;
    }
}
