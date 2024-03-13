package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterCombinationOfaPhoneNumber {

    public static List<String> combinationOfAPhoneNumber(String input) {
        List<String> result = new ArrayList<>();
        String[] telephoneValue = {"","abc","dcf","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if (input.length() < 2){
            if (Integer.parseInt(input) >= 2){
                for (int getIndex = 0 ; getIndex < telephoneValue.length; getIndex++){
                    for (int getElement = 0 ; getElement < telephoneValue[getIndex].length(); getElement++){
                        if (getIndex == Integer.parseInt(input) - 1){
                            result.add(String.valueOf(telephoneValue[getIndex].charAt(getElement)));
                        }
                    }
                }
            }
        }
        if (input.length() > 2){
            for (int getIndex = 0 ; getIndex < telephoneValue.length ; getIndex++){
                for (int getElement = 1 ; getElement < telephoneValue[getIndex + 1].length(); getElement++){

                }
            }
        }
        return result;
    }

}
