package leetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleNumberTest {

    @Test
    public void singleNumberTest(){
        int [] number = {4,1,2,1,2};
        int output = 4;
        assertEquals(output,SingleNumber.singleNumber(number));
    }
}