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

    @Test
    public void secondTest() {
        int[] input = {3, 2, 2, 1};
        int limit = 3;
        assertEquals(3, BoatToSavePeople.numberRescueBoat(input, limit));
    }

    @Test
    public void thirdTest(){
        int [] input = {3,5,3,4};
        int limit = 3;
        assertEquals(5, BoatToSavePeople.numberRescueBoat(input,limit));
    }
}
