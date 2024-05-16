package leetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {


    @Test
       public void test() {
        int[] input = {3, 2, 2, 3};
        int value = 3;
        int output = 2;
        assertEquals(output,RemoveElement.removeElement(input,value));
    }
    @Test
       public void testTwo() {
        int[] input = {0,1,2,2,3,0,4,2};
        int value = 2;
        int output = 5;
        assertEquals(output,RemoveElement.removeElement(input,value));
    }

}