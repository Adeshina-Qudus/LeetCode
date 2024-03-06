package leetCode;

public class ZeroToTheBack {
    public static int[] zeroToTheBack(int[] array) {
        int count = 0 ;
        for (int firstLoop = 0; firstLoop < array.length; firstLoop ++){
            for (int secondLoop = 0; secondLoop < array.length; secondLoop++){
                if (array[firstLoop] == array[secondLoop] && array[firstLoop] == 0) {
                    count++;
                    array[array.length - count] = array[firstLoop];
                }
                    array[firstLoop] = array[firstLoop + 1];
            }
        }
        return array;
    }
}
