public class NQueenProblem{
    static int  countways(boolean [][]board,int currentrow){
        int count = 0;
        //base condition
        if(currentrow==board.length){
            return 1;
        }

        for(int col=0;col<board[currentrow].length;col++){
            //check safe state
            if(isSafe(board, currentrow, col)){
                board[currentrow][col]=true;
                count += countways(board, currentrow+1);
                //backtracking code
                board[currentrow][col]=false;
            }
        }
        return count;
    }
    static boolean isSafe(boolean[][] board,int row, int col){
        // same col and above row
        for(int i=row;i>=0;i--){
            if(board[i][col]){
                return false;
            }
        }
        // upper left diagonal
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(board[i][j]){
                return false;
            }
        }
        //upper right diagonal
        for(int i=row,j=col;i>=0 && j<board.length;i--,j++){
            if(board[i][j]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        boolean [][] board = new boolean[4][4];
        System.out.println(countways(board, 0));
    }
}