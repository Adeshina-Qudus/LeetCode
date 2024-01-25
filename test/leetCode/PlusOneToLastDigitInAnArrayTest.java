package leetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneToLastDigitInAnArrayTest {
    @Test
    public void firstTest(){
        int [] inputArray = {1,2,9};
        int [] outputArray = {1,3,0};
        assertArrayEquals(outputArray,PlusOneToLastDigitInAnArray.plusOneToLastElement(inputArray));
    }
    @Test
    public void secondTest(){
        int [] inputArray = {9};
        int [] outputArray = {1,0};
        assertArrayEquals(outputArray,PlusOneToLastDigitInAnArray.plusOneToLastElement(inputArray));
    }
    @Test
    public void thirdTest(){
        int [] inputArray = {4,3,2,1};
        int [] outputArray = {4,3,2,2,};
        assertArrayEquals(outputArray,PlusOneToLastDigitInAnArray.plusOneToLastElement(inputArray));
    }
}