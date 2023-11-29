package leetCode;

public class AddTwoNumbers {


    public static int reverseNumbers(int[] array) {
        StringBuilder number = new StringBuilder();
        for (int loop = array.length -1; loop >= 0; loop--){
            number.append(array[loop]);
        }
        return Integer.parseInt(String.valueOf(number));
    }
    public static int sumNumbers(int [] firstArray , int [] secondArray){
        int firstResult = reverseNumbers(firstArray);
        int secondResult = reverseNumbers(secondArray);
        return firstResult + secondResult;
    }

    public static int [] addTwoNumbers(int [] firstArray, int [] secondArray) {
        String result = String.valueOf(sumNumbers(firstArray, secondArray));
        int[] array = new int[result.length()];
        int change = 0 ;
        for (int loop = result.length() - 1; loop >= 0; loop--) {
            array[change] = Integer.parseInt(String.valueOf(result.charAt(loop)));
            change ++;
        }
        return array;

    }

}
