package leetCode;

public class BiggestValueInAStringArrayByAddingEachAsciiValueOfEachLetters {
    public static String addingAsciiValue(String[] strings) {
        int result = 0;
        int secondResult = 0;
        String output = "";
        for (String string : strings) {
            for (int loopingTroughString = 0; loopingTroughString < string.length(); loopingTroughString++) {
                result += string.charAt(loopingTroughString);
            }
            if (result > secondResult) {
                output = string;
                secondResult = result;
            }
            result = 0;
        }
        return output;
    }
}
