package leetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainerWithMostWaterTest {


    @Test
    public void testMostWater() {
        int [] input = {1,8,6,2,5,4,8,3,7};
        int output = 49;
        assertEquals(output,ContainerWithMostWater.containerWithMostWater(input));
    }
}
