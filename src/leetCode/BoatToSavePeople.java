package leetCode;

public class BoatToSavePeople {


    public static int numberRescueBoat(int[] input, int limit) {

        sortArray(input);
        int countingBoatNeeded = 0;
        int summingWeight = 0;

        for (int count = 0; count < input.length; count++) {
            if (input[count] >= limit) {
                countingBoatNeeded++;
                summingWeight = 0;
            } else {
                summingWeight += input[count];
                if (summingWeight >= limit) {
                    countingBoatNeeded++;
                }
            }
        }
        return countingBoatNeeded;
    }

    private static void sortArray(int[] input) {

        for (int outterLoop = 0; outterLoop < input.length; outterLoop++) {
            for (int innerLoop = 0; innerLoop < input.length; innerLoop++) {
                if (input[outterLoop] < input[innerLoop]) {
                    int temp = input[innerLoop];
                    input[innerLoop] = input[outterLoop];
                    input[outterLoop] = temp;
                }
            }
        }
    }
}
