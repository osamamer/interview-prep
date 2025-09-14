package Backtracking;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, word, 0, i, j)) // You have to try to start from every position
                    return true;
            }
        }
        return false;
    }
    public boolean dfs(char[][] board, String word, int i, int row, int col) {
        if (i == word.length()) { // i is the index we're currently trying to match
            return true; // if i equals the length, then we've already matched all characters
        }
        int rows = board.length, cols = board[0].length;
//        int row = i / cols, col = i % cols;
        if (row < 0 || row >= rows
            || col < 0 || col >= cols || word.charAt(i) != board[row][col]) {
            return false; // THE ORDER MATTERS!!!!!!!!
            // If you have the word.charAt() first, then you might be out of bounds.
        }
        char kept = board[row][col];
        board[row][col] = '#'; // This ensures that you mark a character as visited so that you can't
        // traverse it again. If you do false will be returned.
        boolean found =
                   dfs(board, word, i + 1, row, col - 1)
                || dfs(board, word, i + 1, row, col + 1)
                || dfs(board, word, i + 1, row - 1, col)
                || dfs(board, word, i + 1, row + 1, col);
        // Go in every direction. Remember that this is done separately for every starting position on board.
        board[row][col] = kept; // Undo
        return found; // When true is found, it's propagated up the call stack and instantly returned because it doesn't check the other ORs.
    }
}
