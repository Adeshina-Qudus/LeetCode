package leetCode;

public class MedianOfTwoSortedArrayDouble {
    public static double medianOfTwoSortedArrayDouble(int[] firstArray, int[] secondArray){
        double result = 0.00;
        int [] merge = merged(firstArray, secondArray);
        sortMerged(merge);
        System.out.println(merge.length);
        if (merge.length % 2 != 0){
            result = merge[merge.length / 2];
        }else {
            double sum = merge[merge.length / 2] + merge[(merge.length / 2) - 1];
            result = sum / 2;
        }
        return result;
    }
    private static void sortMerged(int[] merge) {
        for (int outter = 0; outter < merge.length;outter++){
            for (int inner = 0; inner < merge.length;inner++){
                if (merge[outter] < merge[inner]){
                    int temp = merge[inner];
                    merge[inner] = merge[outter];
                    merge[outter] = temp;
                }
            }
        }
    }

    private static int [] merged(int[] firstArray, int[] secondArray) {
        int [] mergedArray = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, mergedArray, 0, firstArray.length);
        System.arraycopy(secondArray,0,mergedArray, firstArray.length, secondArray.length);
        return mergedArray;
    }
}
