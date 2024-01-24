package leetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReturnNonDuplicateNumberTest {
    @Test
    public void test(){
        int [] inputArray = {2,2,1,3,3};
        int output = 1;
        assertEquals(output,ReturnNonDuplicateNumber.nonDuplicateNumber(inputArray));
    }
    @Test
    public void secondTest(){
        int [] inputArray = {4,3,2,1,1,2,2,3};
        int output = 4;
        assertEquals(output,ReturnNonDuplicateNumber.nonDuplicateNumber(inputArray));
    }
    @Test
    public void thirdTest(){
        int [] inputArray = {1};
        int output = 1;
        assertEquals(output,ReturnNonDuplicateNumber.nonDuplicateNumber(inputArray));
    }

}