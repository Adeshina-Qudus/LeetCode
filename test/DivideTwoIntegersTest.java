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
    @Test
    public void divideNumberWithOutDivisorModOperatorTest2(){
        int input = 10;
        int divisor = 3;
        assertEquals(3, DivideTwoIntegers.divideTwoIntegers(input,divisor));
    }

}
