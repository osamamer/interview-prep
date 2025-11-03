package Graphs;

import java.util.ArrayList;
import java.util.List;

public class setZeroes {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }
    public static void setZeroes(int[][] matrix) { // YOU WERE CALLING THE FUNCTION ON ANY ZERO YOU FIND, BUT YOU FORGOT THAT SOME OF THE ZEROES YOU FIND
        // AREN'T REALLY ZEROES IN THE ORIGINAL MATRIX! YOU JUST SET THEM TO ZERO!
        List<Integer> rows = new ArrayList<>();
        List<Integer> cols = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        setRowColZero(matrix, rows, cols);
    }
    public static void setRowColZero(int[][] matrix, List<Integer> rows, List<Integer> cols) {
        for (int row : rows) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[row][j] = 0;
            }
        }
        for (int col : cols) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][col] = 0;
            }
        }
    }
}
