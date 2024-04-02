package leetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestPalindromicSubstringTest {


    @Test
    public void palindromicTest(){
        String input = "cbbd";
        String output = "bb";
        assertEquals(output,LongestPalindromicSubstring.palindromicSubstring(input));
    }
    @Test
    public void palindromicTwoTest(){
        String input = "babad";
        String output = "bab";
        assertEquals(output,LongestPalindromicSubstring.palindromicSubstring(input));
    }
}
