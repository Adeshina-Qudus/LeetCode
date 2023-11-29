package leetCode;

import java.util.Arrays;
    public class RotateImage {
        public static void main(String[] args) {

            int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            for (int outter = 0; outter < array.length; outter++) {
                for (int inner = 0; inner < array[outter].length; inner++) {
                    if (array[outter][inner] == outter){
                        int temp = array[outter][inner];
                        array[inner] = new int[]{array[outter][inner]};
                        array[outter][inner] = temp;
                    }
                }
                System.out.println(Arrays.deepToString(array));
            }
        }

        public static void rotateImage(int [][] array) {
            array = new int[3][3];
            int count = 0;
            for (int outter = 0 ; outter < array.length;outter++){
                System.out.println();
                for (int inner = 0; inner < array[outter].length;inner++){
                    count++;
                    System.out.print(array[outter][inner] = count);
                    System.out.print(" \t ");
                    array[outter][outter] = array[inner][outter];
                }
            }

        }

    }

