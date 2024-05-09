package leetCode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LetterCombinationOfAPhoneNumberTest {


    @Test
    public void firstTest(){
        String input = "23";
        String [] result = {"ad","ae","af","bd","be","bf","cd","ce","cf"};
        assertArrayEquals(result,LetterCombinationOfAPhoneNumber.letterCombinationOfAPhoneNumber(input).toArray());
    }
    @Test
    public void secondTest(){
        String input = "2";
        String [] result = {"a","b","c"};
        assertArrayEquals(result,LetterCombinationOfAPhoneNumber.letterCombinationOfAPhoneNumber(input).toArray());
    }
    @Test
    public void thirdTest(){
        String input = "";
        System.out.println(Arrays.toString(LetterCombinationOfAPhoneNumber.letterCombinationOfAPhoneNumber(input).toArray()));
    }
}
