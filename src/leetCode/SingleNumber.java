package leetCode;

public class SingleNumber {
    public static int singleNumber(int[] number) {
        int result = 0;
        int counterOfSingleNumber = 0;
        for (int eachElement : number) {
            counterOfSingleNumber = allElement(eachElement,number,counterOfSingleNumber);
            if (counterOfSingleNumber == 1) {
                result = eachElement;
            }
            counterOfSingleNumber = 0;
        }
        return result;
    }

    private static int allElement(int eachElement, int[] number, int counterOfSingleNumber) {
        for (int element : number){
            if(element == eachElement){
                counterOfSingleNumber++;
            }
        }
        return counterOfSingleNumber;
    }


}
