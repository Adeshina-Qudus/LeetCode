package leetCode;

public class Anagram {


    public static boolean anagram(String input, String rearrangingInput) {
        int counter = 0;
        int counterOfDoubleElement = 0;
        for (int element = 0 ; element < input.length(); element++){
            for (int rearrangeElement = 0; rearrangeElement < rearrangingInput.length();rearrangeElement++) {
                if (input.charAt(element) == rearrangingInput.charAt(rearrangeElement)) {
                    counterOfDoubleElement++;
                }
            }
            if (counterOfDoubleElement > 1) {
                counterOfDoubleElement = 1;
            }
            counter += counterOfDoubleElement;
            counterOfDoubleElement = 0;
        }
        return counter == input.length();
    }
}
