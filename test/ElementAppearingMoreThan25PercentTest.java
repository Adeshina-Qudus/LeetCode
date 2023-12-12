import leetCode.ElementAppearingMoreThan25Percent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElementAppearingMoreThan25PercentTest {


    @Test
    public void testElementAppearingMoreThan25percentTest(){
        int [] input = {1,2,2,6,6,6,6,7,10};
        int result = 6;
        assertEquals(result, ElementAppearingMoreThan25Percent.elementAppearingMoreThan25Percent(input));
    }
 @Test
    public void testElementAppearingMoreThan25percentTestTwo(){
        int [] input = {1,1};
        int result = 1;
        assertEquals(result, ElementAppearingMoreThan25Percent.elementAppearingMoreThan25Percent(input));
    }


}
