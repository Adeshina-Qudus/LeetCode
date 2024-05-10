package leetCode;
import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfAPhoneNumber {

    public static List<String> letterCombinationOfAPhoneNumber(String input) {
        String [] phoneNumbers = {" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> result = new ArrayList<>();
        if (input.isEmpty()){
            return result;
        }
        int firstNumber = Integer.parseInt(String.valueOf(input.charAt(0)));
        if (input.length() > 1){
            gettingElementTwo(input, phoneNumbers, firstNumber, result);
        }else {
            gettingElementOne(result, phoneNumbers[firstNumber]);
        }
        return result;
    }

    private static void gettingElementOne(List<String> result, String phoneNumbers) {
        String takingNumbers;
        for (int count = 0; count < phoneNumbers.length(); count++){
            takingNumbers = String.valueOf(phoneNumbers.charAt(count));
            result.add(takingNumbers);
        }
    }

    private static void gettingElementTwo(String input, String[] phoneNumbers, int firstNumber, List<String> result) {
        String takingNumbers;
        int secondNumber;
        secondNumber = Integer.parseInt(String.valueOf(input.charAt(1)));
        for (int count = 0; count < phoneNumbers[firstNumber].length(); count++){
            for (int counter = 0; counter < phoneNumbers[secondNumber].length() ; counter++){
                takingNumbers = String.valueOf(phoneNumbers[firstNumber].charAt(count) ).
                        concat(String.valueOf(phoneNumbers[secondNumber].charAt(counter)));
                result.add(takingNumbers);
            }
        }
    }
}
