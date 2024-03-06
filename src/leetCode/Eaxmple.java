package leetCode;

import java.util.Arrays;

public class Eaxmple {
    public static void main(String[] args) {
        int[][] inputArray = {{2, 3,}, {4, 5}};
        for (int firstLoop = 0; firstLoop < inputArray.length; firstLoop++) {
            for (int secondLoop = 0; secondLoop < inputArray[firstLoop].length; secondLoop++) {
                if (secondLoop == 1) {
                    int temp = inputArray[firstLoop][secondLoop];
                    inputArray[firstLoop][secondLoop] = inputArray[secondLoop][firstLoop];
                    inputArray[secondLoop][firstLoop] = temp;
                }
            }
        }
        System.out.println(Arrays.deepToString(inputArray));
    }

}
