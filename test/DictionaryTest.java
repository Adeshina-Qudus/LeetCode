import leetCode.Dictionary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DictionaryTest {



    @Test
    public void test(){

        String [] dictionary = {"ale","apple","monkey","plea"};
        String givenInput = "abpcplea";
        String output = "apple";
        assertEquals(output, Dictionary.dictionary(dictionary,givenInput));
    }
}
