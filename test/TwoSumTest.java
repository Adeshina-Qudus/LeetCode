import leetCode.TwoSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {


    @Test
    public void testTwoSum(){

        int [] array = {2,7,11,15};
        int target = 9;
        assertArrayEquals(new int[]{0,1}, TwoSum.twoSum(array,target));
    }

}