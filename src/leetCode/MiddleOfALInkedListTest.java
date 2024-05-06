package leetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MiddleOfALInkedListTest {



    @Test
    public void firstTest(){
        int [] input = new int[]{1,2,3,4,5};
        int [] output = new int[]{3,4,5};
        assertArrayEquals(output,MiddleOfALInkedList.middleOfALinkedTest(input));
    }
}
