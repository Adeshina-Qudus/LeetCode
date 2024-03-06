package Test;

import leetCode.LetterCombinationOfaPhoneNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterCombinationOfaPhoneNumberTest {


//    @Test
//    public void testLetterCombinationOfaPhoneNumber(){
//        String input = "23";
//        String [] output = {"ad","ae","af","bd","be","bf","cd","ce","cf"};
//        assertEquals(output, LetterCombinationOfaPhoneNumber.combinationOfAPhoneNumber(input).toArray());
//    }
@Test
public void testLetterCombinationOfaPhoneNumber(){
    String input = "3";
    String [] output = {"a","b","c"};
    assertEquals(output, LetterCombinationOfaPhoneNumber.combinationOfAPhoneNumber(input).toArray());
}

}