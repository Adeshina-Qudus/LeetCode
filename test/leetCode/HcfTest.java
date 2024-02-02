package leetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HcfTest {



    @Test
    public void test(){
        int [] inputArray = {8,4,12};
        int [] outputArray = {2,2};
        assertArrayEquals(outputArray,Hcf.hcf(inputArray));
    }
    @Test
    public void secondTest(){
        int [] inputArray = {6,3,9};
        int [] outputArray = {3};
        assertArrayEquals(outputArray,Hcf.hcf(inputArray));
    }

}