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
}
