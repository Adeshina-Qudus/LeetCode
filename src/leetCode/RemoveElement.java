package leetCode;

import java.util.ArrayList;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int element : nums) {
            if (element != val) {
                result.add(element);
            }
        }
        return result.size();
    }

}
