import leetCode.SummaryRanges;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SummaryRangesTest {



    @Test
    public void summaryRangesInputTest(){
        int [] inputArray = {0,1,2,4,5,7};
        String [] result = {"0 -> 2","4->5","7"};
        assertEquals(result, SummaryRanges.summaryRanges(inputArray));
    }

}
