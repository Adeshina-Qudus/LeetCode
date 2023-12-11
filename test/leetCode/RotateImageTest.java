package leetCode;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateImageTest {

   @Test
    public void rotateImageTest(){

       int [][] inputImage = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
       int [] [] outputImage = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
       RotateImage.rotateImage(inputImage);
   }
}