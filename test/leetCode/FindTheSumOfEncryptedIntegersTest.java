package leetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheSumOfEncryptedIntegersTest {


    @Test
    public void test(){
        int [] inputtedArray = {1,2,3};
        int output = 6 ;
        assertEquals(output,FindTheSumOfEncryptedIntegers.sumOfEncryptedIntegers(inputtedArray));
    }
    @Test
    public void secondTest(){
        int [] inputtedArray = {10,21,31};
        int output = 66 ;
        assertEquals(output,FindTheSumOfEncryptedIntegers.sumOfEncryptedIntegers(inputtedArray));
    }

}
