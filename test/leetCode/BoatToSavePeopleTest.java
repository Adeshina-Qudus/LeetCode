package leetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoatToSavePeopleTest {


    @Test
    public void firstTest(){
        int [] input = {1,2};
        int limit = 3;
        assertEquals(1, BoatToSavePeople.numberRescueBoat(input,limit));
    }
}
