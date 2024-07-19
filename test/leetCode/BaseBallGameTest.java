package leetCode;

import org.junit.jupiter.api.Test;

import java.util.Vector;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseBallGameTest {



    @Test
    public void testBaseBallGame() {
        String [] elements = {"5","2","C","D","+"};
        int output = 30;
        assertEquals(output,BaseBallGame.baseBallGame(elements));
    }
    @Test
    public void testBaseBallGameTwo() {
        String [] elements = {"5","-2","4","C","D","9","+","+"};
        int output = 27;
        assertEquals(output,BaseBallGame.baseBallGame(elements));
    }@Test
    public void testBaseBallGameThree() {
        String [] elements = {"1","C"};
        int output = 0;
        assertEquals(output,BaseBallGame.baseBallGame(elements));
    }
}


