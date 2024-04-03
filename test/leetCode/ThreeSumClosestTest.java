package leetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreeSumClosestTest {


    @Test
    public void test(){
        int [] input = {-1,2,1,-4};
        int target = 1;
        int output = 2;
        assertEquals(output,ThreeSumClosest.threeSumClosest(input,target));
    }

}
