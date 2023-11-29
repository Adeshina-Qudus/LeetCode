package test;

import leetCode.DivideTwoIntegers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivideTwoIntegersTest {



    @Test
    public void divideNumberWithOutDivisorModOperatorTest(){
        int input = 7;
        int divisor = -3;
        assertEquals(-2, DivideTwoIntegers.divideTwoIntegers(input,divisor));
    }

}
