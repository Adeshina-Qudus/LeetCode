package leetCode;

import java.util.ArrayList;
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
                            result.add(telephoneValue[getIndex].);
                        }
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        String [] telephoneValue = {"","abc","dcf","ghi","jkl","mno","pqrs","tuv","wxyz"};

    }
}
