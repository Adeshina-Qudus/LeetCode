package leetCode;

public class MostOccurrence {


    public static int mostOccurrence(int[] inputArray) {
        int number = 0;
        int counter = 0;
        int result = 0;
        for (int firstLoop = 0 ; firstLoop < inputArray.length; firstLoop++){
            counter = getCounter(inputArray, firstLoop, counter);
            if (counter > number){
                result = inputArray[firstLoop];
            }
            number = counter;
            counter = 0;
        }
        return result;
    }

    private static int getCounter(int[] inputArray, int firstLoop, int counter) {
        for (int secondLoop = 0; secondLoop < inputArray.length; secondLoop++){
            if (inputArray[firstLoop] == inputArray[secondLoop]){
                counter++;
            }
        }
        return counter;
    }
}
