import leetCode.CombinationSumII;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CombinationSumIITest {



    @Test
    public void combinationSumTest(){

        int [] candidateNumbers = {10,1,2,7,6,1,5};
        int target = 8;
        int[][] result = {{1,1,6},{1,2,5},{1,7},{2,6}};
        assertArrayEquals(result, CombinationSumII.combinationSum(candidateNumbers,target));

    }
}
