package Recursion.Practice;


// for a mxn Maze return all the possible way to reach the last point only move right and down

public class MazePath {

    public static void findPaths( String path ,  int row, int col  ){

        if( row == 1 && col == 1  ){

            System.out.println( path );
            return;

        }

        if( row > 1 ){
            findPaths(path + "D", row-1, col);
            
        }

        // If we can go Diagonally ( C- Cross )
        if( row > 1 && col > 1 ){  
            findPaths(path + 'C', row-1, col-1);
        }

        if( col > 1  ){
            findPaths(path + "R", row, col-1);
        }

    }

    public static void main(String[] args) {

         findPaths("", 3, 3);
        
    }
    
}
