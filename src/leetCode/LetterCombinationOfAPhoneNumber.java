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
        String takingNumbers;
        int firstNumber = Integer.parseInt(String.valueOf(input.charAt(0)));
        int secondNumber = 0;
        if (input.length() > 1){
            secondNumber = Integer.parseInt(String.valueOf(input.charAt(1)));
            for (int count = 0 ; count < phoneNumbers[firstNumber].length(); count++){
                for (int counter = 0; counter < phoneNumbers[secondNumber].length() ; counter++){
                    takingNumbers = String.valueOf(phoneNumbers[firstNumber].charAt(count) ).
                            concat(String.valueOf(phoneNumbers[secondNumber].charAt(counter)));
                    result.add(takingNumbers);
                }
            }
        }else {
            for (int count = 0 ; count < phoneNumbers[firstNumber].length(); count++){
                takingNumbers = String.valueOf(phoneNumbers[firstNumber].charAt(count));
                result.add(takingNumbers);
            }
        }
        return result;
    }
}
