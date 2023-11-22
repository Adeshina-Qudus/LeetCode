package Test;

import LeetCode.SubSequence;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubSequenceTest {

    @Test
    public void testSubSequence(){
        String input = "ace";
        String subSequence ="abcde";
        assertTrue(SubSequence.subSequence(input,subSequence));
    }

}