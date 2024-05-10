package leetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteIndexTest {


    @Test
    public void test(){
        int [] inputArray = {3,1,5,4,8,2,4,3,6,5};
        int x = 1;
        int y = 2;
        int output = 4;
        assertEquals(output,AbsoluteIndex.absoluteIndex(inputArray,x,y));
    }

}