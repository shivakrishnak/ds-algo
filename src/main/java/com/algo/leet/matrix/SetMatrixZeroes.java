package com.algo.leet.matrix;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/set-matrix-zeroes/
public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] mat1 = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] mat2 = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        new SetMatrixZeroes().setZeroes(mat2);
        printMatrix(mat2);
    }

    public void setZeroes(int[][] matrix) {
        List<List<Integer>> zeros = new ArrayList<>();
        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    //setZeroToMatrix(matrix, i, j);
                    row[i] = -1;
                    col[j] = -1;
                }
            }
        }
        setZeroInMatrix(matrix, row, col);
    }

    private void setZeroInMatrix(int[][] matrix, int[] row, int[] col) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (row[i] == -1 || col[j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    private void setZeroInMatrix1(int[][] matrix, int[] row, int[] col) {
        for (int k = 0; k < row.length; k++) {
            if (row[k] == -1) {
                for (int i = 0; i < matrix[0].length; i++) {
                    matrix[k][i] = 0;
                }
            }
        }
        for (int l = 0; l < col.length; l++) {
            if (col[l] == -1) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][l] = 0;
                }
            }
        }
    }

    public static void printMatrix(int matrix[][]) {
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
