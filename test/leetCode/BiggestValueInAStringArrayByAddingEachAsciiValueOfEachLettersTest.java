package leetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BiggestValueInAStringArrayByAddingEachAsciiValueOfEachLettersTest {



    @Test
    public void test(){
        String [] strings = {"Rabbit","SHEEP","Lion","EAGLE"};
        String output = "Rabbit";
        assertEquals(output,BiggestValueInAStringArrayByAddingEachAsciiValueOfEachLetters.addingAsciiValue(strings));
    }

}