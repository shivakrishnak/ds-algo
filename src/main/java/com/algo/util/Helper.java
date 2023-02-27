package com.algo.util;

public class Helper {

    int[][] mat1 = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
    int[][] mat2 = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            // length returns number of rows
            for (int j = 0; j < matrix[i].length; j++) {
                // here length returns number of columns corresponding to current row
                // using tabs for equal spaces, looks better aligned
                // matrix[i][j] will return each element placed at row ‘i',column 'j'
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
