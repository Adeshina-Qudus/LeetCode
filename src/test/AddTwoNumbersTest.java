package test;

import leetCode.AddTwoNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {


    @Test
    public void testThatArrayCanBeReversed(){

        int[] array = {2,4,3};
        int[] secondArray = {5,6,4};
        assertEquals(342, AddTwoNumbers.reverseNumbers(array));
        assertEquals(465, AddTwoNumbers.reverseNumbers(secondArray));
    }
    @Test
    public void testThatArrayCanBeSumUp(){
        int[] array = {2,4,3};
        int[] secondArray = {5,6,4};
        assertEquals(807, AddTwoNumbers.sumNumbers(array,secondArray));;
    }
    @Test
    public void testThatArrayCanBeSumUpAndReversed(){
        int[] array = {9,9,9,9,9,9,9};
        int[] secondArray = {9,9,9,9};
        assertArrayEquals(new int[]{8,9,9,9,0,0,0,1}, AddTwoNumbers.addTwoNumbers(array,secondArray));;
    }



}