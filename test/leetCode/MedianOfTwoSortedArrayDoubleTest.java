package leetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianOfTwoSortedArrayDoubleTest {


    @Test
    public void firstTest(){
        int [] firstArray = {1,3};
        int [] secondArray = {2};
        double output = 2.00;
        assertEquals(output,MedianOfTwoSortedArrayDouble.medianOfTwoSortedArrayDouble(firstArray,secondArray));
    }
}
