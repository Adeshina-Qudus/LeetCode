package leetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddFirstTwoNumberTest {



    @Test
    public void test(){
        int [] inputArray = {2,2,5,6,7,2,3};
        int [] outputArray = {4,11,9,3};
        assertArrayEquals(outputArray,AddFirstTwoNumber.addTwoNumbers(inputArray));
    }

    @Test
    public void secondTest(){
        int [] inputArray = {3,4,5,1,5};
        int [] outputArray = {7,6,5};
        assertArrayEquals(outputArray,AddFirstTwoNumber.addTwoNumbers(inputArray));
    }

}