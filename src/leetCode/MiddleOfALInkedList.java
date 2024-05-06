package leetCode;

public class MiddleOfALInkedList {
    public static int[] middleOfALinkedTest(int[] input) {
        int [] result;
        if (input.length % 2 != 0){
            result = new int[(input.length / 2) + 1];
        }else {
            result = new int[input.length / 2];
        }
        return gettingElement(input,result);

    }

    private static int[] gettingElement(int[] input, int[] result) {
        int inputCounter = result.length - 1;
        for (int count = 0; count < result.length; count++){
            result[count] = input[inputCounter];
            inputCounter++;
        }
        return result;
    }

}
