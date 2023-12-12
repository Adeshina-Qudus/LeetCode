import leetCode.SortAndRaiseToPower;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortAndRaiseToPowerTest {



    @Test
    public void sortAndRaiseToPowerTest(){
        int[] arrayInput = {4,7,6,5,3};
        int[] arrayResult  = {9,16,25,36,49};
        assertArrayEquals(arrayResult, SortAndRaiseToPower.sortAndRaiseToPower(arrayInput));

    }
}
