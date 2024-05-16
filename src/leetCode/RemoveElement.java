package leetCode;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int counter = 0;
        for (int element : nums) {
            if (element != val) {
                counter++;
            }
        }
        return counter;
    }

}
