package leetCode;

import org.junit.jupiter.api.Test;

import java.awt.image.LookupOp;

import static org.junit.jupiter.api.Assertions.*;

class LowestInTwoArrayTest {


    @Test
    public void test(){
        int [] inputArray = {2,-3,5,6,7,8};
        int [] input = {1,-3,7,10,11,8};
        int output = -3;
        assertEquals(output,LowestInTwoArray.lowestInTwoArray(inputArray,input));
    }
    @Test
    public void secondTest(){
        int [] inputArray = {5,4,11,13,9};
        int [] input = {9,11,15,1,14};
        int output = 9;
        assertEquals(output,LowestInTwoArray.lowestInTwoArray(inputArray,input));
    }

}