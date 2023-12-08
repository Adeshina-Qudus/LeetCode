import leetCode.SpecialPositionsInABinaryMatrix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpecialPositionsInABinaryMatrixTest {



    @Test
    public void special_Positions_in_a_Binary_Matrix_Test(){
        int [][] inputArray = {{1,0,0},{0,0,1},{1,0,0}};
        int output = 1;
        assertEquals(output, SpecialPositionsInABinaryMatrix.specialPositionsInABinaryMatrix(inputArray));
    }
    @Test
    public void special_Positions_in_a_Binary_Matrix_SecondTest(){
        int [][] inputArray = {{1,0,0},{0,1,0},{0,0,1}};
        int output = 3;
        assertEquals(output, SpecialPositionsInABinaryMatrix.specialPositionsInABinaryMatrix(inputArray));
    }
}
