package leetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ZeroToTheBackTest {


    @Test
    public void firstTest(){
        int [] array = {0,4,2,0,5};
        int [] output = {4,2,5,0,0};
        assertArrayEquals(output,ZeroToTheBack.zeroToTheBack(array));
    }
}
