package leetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MiddleOfALInkedListTest {



    @Test
    public void firstTest(){
        int [] input = {1,2,3,4,5};
        int [] output = {3,4,5};
        assertArrayEquals(output,MiddleOfALInkedList.middleOfALinkedTest(input));
    }
    @Test
    public void secondTest(){
        int [] input = {1,2,3,4,5,6};
        int [] output = {4,5,6};
        assertArrayEquals(output,MiddleOfALInkedList.middleOfALinkedTest(input));
    }
}
