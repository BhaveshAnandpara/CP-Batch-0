package Recursion.Questions;

public class SodukuSolver {

    public static void solveSudoku(char[][] board) {

            solve(board, 0, 0);


    }

    private static boolean solve(char[][] board, int row, int col) {

        if( row == board.length ){
            displayBoard(board);
            return true;}

        int nextCol = 0;
        int nextRow = 0;

        if( col != board.length - 1 ){
            nextCol = col + 1;
            nextRow = row;
        }else{

            nextRow = row + 1;
            nextCol = 0;
        }

        if( board[ row ][ col ] != '.'){

            if( solve(board, nextRow, nextCol) ) return true;
            return false;

        }

        for (int i = 1; i <= board.length; i++) {
            
            if( isSafe(i, row, col, board) ) {

                board[ row ][ col ] = (char)(i + '0');
                
                if( solve(board, nextRow, nextCol) ) return true;
                else{
                    
                    board[ row ][ col ] = '.';
                }

            }
            

        }

        return false;

    }

    private static void displayBoard(char[][] board) {

        for (char[] cs : board) {

            for (char cs2 : cs) {

                System.out.print(cs2 + " ");

            }

            System.out.println();
        }

        System.out.println();
    }

    private static boolean isSafe(int value, int row, int col, char[][] board) {

        for (int i = 0; i < board.length; i++) {

            int colVal = board[i][col] - '0';
            int rowVal = board[row][i] - '0';

            if (colVal == value || rowVal == value)
                return false;

        }

        row = 3 * (row / 3);
        col = 3 * (col / 3);

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if ((board[row][col] - '0') == value) {
                    return false;
                }

                col++;
            }

            col -= 3;
            row++;

        }

        return true;

    }

    public static void main(String[] args) {

        char[][] board = {
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

        solveSudoku(board);

    }

}
