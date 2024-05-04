package leetCode;

public class BoatToSavePeople {


    public static int numberRescueBoat(int[] input, int limit) {
        int sum = 0 ;
        for (int element : input) {
            sum += element;
        }
        return countingBoatNeeded(sum,limit);
    }
    private static int countingBoatNeeded(int sum, int limit) {
        int countingBoatNeeded = sum / limit;
        if (sum % limit != 0){
            countingBoatNeeded++;
        }
        return countingBoatNeeded;
    }
}
