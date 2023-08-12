public class SolveSudoku {
    static final int max_size = 9;
    static char[][] board = {
            { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
            { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
            { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
            { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
            { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
            { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
            { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
            { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
            { '.', '.', '.', '.', '8', '.', '.', '7', '9' }

    };

    static boolean solver(int row, int col) {
        // reset
        if (col == max_size) {
            row = row + 1;
            col = 0;
        }
        if (row == max_size) {
            return true;
        }
        if (board[row][col] != '.') {
            return solver(row, col + 1);
        }
        for (int i = 1; i <= max_size; i++) {
            char num = (char) (i+'0');
            if (isSafe(row, col, num)) {
                board[row][col] = num;
                //System.out.println("filled : "+num );
                boolean result = solver(row, col + 1);
                if (result) {
                    return true;
                }
                // backtracking
                board[row][col] = '.';
            }
        }
        return false;
    }

    private static boolean isPresentInRow(int row, char value) {
        for (int i = 0; i < max_size; i++) {
            if (board[row][i] == value) {
                return true;
            }
        }
        return false;
    }

    private static boolean isPresentInCol(int col, char value) {
        for (int i = 0; i < max_size; i++) {
            if (board[i][col] == value) {
                return true;
            }
        }
        return false;
    }

    private static boolean isPresentInGrid(int row, int col, char value) {
        int startrow = row - row % 3;
        int startcol = col - col % 3;
        for (int i = startrow; i < startrow + 3; i++) {
            for (int j = startcol; j < startcol + 3; j++) {
                if (board[i][j] == value) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isSafe(int row, int col, char value) {
        return !isPresentInRow(row, value) && !isPresentInCol(col, value) && !isPresentInGrid(row, col, value);
    }
    public static void main(String[] args) {
        solver(0, 0);
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+",");
            }
            System.out.println();
        }
        
    }
}
