package leetCode;

import java.util.Arrays;

public class RotateImage {

    public static void main(String[] args) {
        int [][] matrix = {{5,9,1},{3,8,2},{1,2,3}};
        rotateImage(matrix);
    }
        public static void rotateImage(int [][] matrix) {
            for (int outter = 0 ; outter < matrix.length;outter++){
                for (int inner = outter + 1; inner < matrix.length ;inner++){
                    int temp = matrix[outter][inner];
                    matrix[outter][inner] = matrix[inner][outter];
                    matrix[inner][outter] = temp;
                }
            }
            System.out.println(Arrays.deepToString(reverseImage(matrix)));
        }
        private static int[][] reverseImage(int[][] matrix) {
            for (int reverse = 0; reverse < matrix.length; reverse++){
                int left = 0 , right = matrix.length - 1;
                while (left < right){
                    int temp = matrix[reverse][left];
                    matrix[reverse][left] = matrix[reverse][right];
                    matrix[reverse][right] = temp;
                    left++;
                    right--;
                }
            }
            return matrix;
        }
        public static void printImage(int[][] matrix) {
            for (int[] row : matrix) {
                for (int column : row) {
                    System.out.print(column + " ");
                }
                System.out.println();
            }
        }
    }

