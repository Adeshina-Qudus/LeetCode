package leetCode;

import java.util.Scanner;

public class MiddleOfALInkedList {
    public static int[] middleOfALinkedTest(int[] input) {
        int [] result;
        int counter;
        if (input.length % 2 != 0){
            result = new int[(input.length / 2) + 1];
            counter = result.length - 1;
        }else {
            result = new int[input.length / 2];
            counter = result.length;
        }
        return gettingElement(result,counter,input);
    }
    private static int[] gettingElement(int[] result, int counter,int [] input) {
        int inputCounter = counter;
        for (int count = 0; count < result.length; count++){
            result[count] = input[inputCounter];
            inputCounter++;
        }
        return result;
    }
}
