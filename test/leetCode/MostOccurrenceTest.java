package leetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MostOccurrenceTest {



    @Test
    public void test(){
        int [] inputArray = {2,1,1,3,3,3,2,3,2};
        int output = 2;
        assertEquals(output,MostOccurrence.mostOccurrence(inputArray));
    }

    @Test
    public void secondTest(){
        int [] inputArray = {3,4,5,5};
        int output = 5;
        assertEquals(output,MostOccurrence.mostOccurrence(inputArray));
    }

}