package leetCode;

import java.util.Arrays;

public class ContainerWithMostWater {


    public static int containerWithMostWater(int[] input) {
        int distance ;
        int []maximumArray = new int[input.length];
        int result;
        int maximum;
        int minimum ;
        int leftPointer = 0 ;
        int rightPointer = input.length - 1 ;
        for (int count = 0 ; count < input.length; count++){
            if (input[leftPointer] < input[rightPointer]){
                minimum = input[leftPointer];
                distance = rightPointer - leftPointer;
                leftPointer++;
            }else {
                minimum = input[rightPointer];
                distance = rightPointer - leftPointer;
                rightPointer--;
            }
            maximum = distance * minimum;
            maximumArray[count] =maximum;
        }
         result = Arrays.stream(maximumArray).max().getAsInt();
        return result;
    }

}
