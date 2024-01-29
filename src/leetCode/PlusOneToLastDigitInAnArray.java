package leetCode;

public class PlusOneToLastDigitInAnArray {

    public static int[] plusOneToLastElement(int[] inputArray) {
        StringBuilder result = new StringBuilder();
        for (int count : inputArray) {
            result.append(count);
        }
        result = new StringBuilder(String.valueOf(Integer.parseInt(String.valueOf(result)) + 1));
        return toArray(String.valueOf(result));
    }
    public static int[] toArray(String result){
        int [] inputArray = new int[result.length()];
        for (int count = 0; count < result.length(); count ++){
            inputArray[count] = Integer.parseInt(String.valueOf(result.charAt(count)));
        }
        return inputArray;
    }
}
