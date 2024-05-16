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

}