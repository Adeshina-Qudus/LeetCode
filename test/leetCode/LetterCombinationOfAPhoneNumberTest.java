package leetCode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LetterCombinationOfAPhoneNumberTest {


    @Test
    public void firstTest(){

        String input = "23";
        String [] result = {"ad","ae","af","bd","be","bf","cd","ce","cf"};
        assertArrayEquals(result,LetterCombinationOfAPhoneNumber.letterCombinationOfAPhoneNumber(input).toArray());
    }
}
