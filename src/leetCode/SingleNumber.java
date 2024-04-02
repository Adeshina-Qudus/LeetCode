package leetCode;

public class SingleNumber {
    public static int singleNumber(int[] number) {
        int result = 0;
        int counterOfSingleNumber = 0;
        for (int eachElement : number) {
            for (int allElement : number) {
                if (eachElement == allElement) {
                    counterOfSingleNumber++;
                }
            }
            if (counterOfSingleNumber == 1) {
                result = eachElement;
            }
            counterOfSingleNumber = 0;
        }
        return result;
    }
}
