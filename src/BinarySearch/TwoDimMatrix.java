package BinarySearch;

public class TwoDimMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length, cols = matrix[0].length;
        int start = 0, end = rows * cols - 1;
        int middle;
        int i, j;
        while (start <= end) {
            middle = (start + end) / 2;
            i = middle / cols;
            j = middle % cols;
            if (matrix[i][j] == target) {
                return true;
            }
            else if (matrix[i][j] > target) {
                end = middle - 1;
            }
            else {
                start = middle + 1;
            }
        }
        return false;
    }
}
