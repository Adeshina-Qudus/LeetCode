package leetCode;

public class CombinationSumII {
    public static int[][]combinationSum(int[] candidateNumbers, int target) {
        int [] candidateNumbersSorted = sort(candidateNumbers);
        for (int count = 0 ; count < candidateNumbersSorted.length ; count++){

        }
        return null;
    }

    private static int[] sort(int[] arrayInput) {
        for (int outter = 0 ; outter < arrayInput.length; outter++){
            for (int inner = 0; inner < arrayInput.length; inner++){
                if (arrayInput[outter] < arrayInput[inner]){
                    int temp = arrayInput[inner];
                    arrayInput[inner] = arrayInput[outter];
                    arrayInput[outter] = temp;
                }
            }
        }
        return arrayInput;
    }
}
