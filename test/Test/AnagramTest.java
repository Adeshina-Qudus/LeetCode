package Test;

import leetCode.Anagram;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    public void anagramTest(){
        String input = "anagram";
        String rearrangingInput = "nagaram";
        assertTrue(Anagram.anagram(input,rearrangingInput));
    }
    @Test
    public void anagramSecondTest(){
        String input = "rat";
        String rearrangingInput = "car";
        assertFalse(Anagram.anagram(input,rearrangingInput));
    }
}