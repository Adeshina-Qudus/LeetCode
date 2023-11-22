package Test;

import LeetCode.RepeatlyAddDigit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatlyAddDigitTest {

    @Test
    public void testRepeatlyAddDigit(){
        String input = "6783";
        int result = 6;
        assertEquals(result, RepeatlyAddDigit.addDigit(input));
    }

}