package leetCode;

public class SpecialPositionsInABinaryMatrix {
    public static int specialPositionsInABinaryMatrix(int[][] inputArray) {
        int counterOfSpecialPosition = 0;
        int numberOfSpecialPosition = 0;
        for (int outterLoop = 0 ; outterLoop < inputArray.length; outterLoop++){
            for (int innerLoop = 0; innerLoop < inputArray[outterLoop].length; innerLoop++) {
                if (inputArray[outterLoop][innerLoop] == 1) {
                    counterOfSpecialPosition++;
                }
            }
        }
        return numberOfSpecialPosition;
    }
}
