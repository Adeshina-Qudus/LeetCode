package test;

import leetCode.FindFirstAndLastPositionOfElement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindFirstAndLastPositionOfElementTest {


    @Test
    public void testFirstAndLastPositionOfElementInSortedArray(){

        int[] array = {5,7,7,8,8,10};
        int target = 8;
        int[] result = {3,4};
        assertArrayEquals(result, FindFirstAndLastPositionOfElement.firstAndLastPositionOfAElement(array,target));
    }

}