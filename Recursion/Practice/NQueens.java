package Recursion.Practice;

public class NQueens {

    public static void nQueens(boolean[][] board,  int row) {

        if (row == board.length) {
            display(board);
        }

        for (int i = 0; i < board.length; i++) {
            
            if( isSafe( board , row  ,i  )){ //Check whether it is safe to place Queen there
                
                board[row][i] = false;
                nQueens(board, row + 1);
                board[row][i] = true;

            }

        }


    }

    private static boolean isSafe( boolean[][] board,int row, int col ){

        
        //Check for all the queen in the column
        for (int i = 0; i < row; i++) {
            
            if( !board[i][col] ) return false;
            
        }
        
        //check the Queens for left diagonals
        int maxLeftDiag = Math.min( row , col );
        
        for (int i = 1; i <= maxLeftDiag; i++) {            
            if( !board[ row-i ][col-i] ) return false;
        }

        //check the Queens for right diagonals
        int maxRightDiag = Math.min( ( board.length - col -1 ) , row );
        
        for (int i = 1; i <= maxRightDiag; i++) {            
            if( !board[ row - i  ][ col + i ] ) return false;
        }

        return true;

    }


    private static void display(boolean[][] board) {

        for (boolean[] row : board) {
            
            for (boolean tile : row) {
                
                if( tile ) System.out.print( " X " );
                else System.out.print( " Q " );
            }

            System.out.println();
            
        }
        
        System.out.println();
    }

    public static void main(String[] args) {

        boolean[][] board = {
                { true, true, true, true },
                { true, true, true, true },
                { true, true, true, true },
                { true, true, true, true }
        };

        nQueens(board, 0);

    }

}
