package Recursion.Practice;

// For an mxn maze
// need to go from (0,0) to ( m,n ) but can go any right or down

public class CountMaze {

    public static int count( int row , int col ){

        // <cmg "ImageNotes\countMaze.jpg">
        if( row == 1|| col == 1 ) return 1; // If in last i.e row == 1 ( cannot go down only right means found a sol ) col == 1 is similar

        int rightCount = count(row - 1, col); // get the possible ways by going down
        int leftCount = count(row, col - 1); // get the possible ways by going right

        return rightCount + leftCount;

    }

    public static void main(String[] args) {

        System.out.println(  count(3, 3) );
        
    }
    
}
