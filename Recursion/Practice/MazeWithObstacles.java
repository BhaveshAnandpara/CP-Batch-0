package Recursion.Practice;

// for a mxn Maze return all the possible way to reach the last point only move right and down

// Avoiding Obstacle

public class MazeWithObstacles {

    public static void findPaths(boolean[][] maze, String path, int row, int col) {

        if (row == 1 && col == 1) {
            System.out.println(path);
            return;
        }

        if (row > 1 && maze[row - 1][col - 1]) {
            findPaths(maze, path + "D", row - 1, col);
        }

        if (col > 1 && maze[row - 1][col - 1]) {
            findPaths(maze, path + "R", row, col - 1);
        }

    }

    public static void fourMoves(boolean[][] maze, String path, int row, int col) {

        if (row == 1 && col == 1) {
            System.out.println(path);
            return;
        }

        // cannot use as it has been visited already
        if( maze[row-1][col-1] ) return;

        if (row > 1 ) { 

            maze[row - 1][col - 1] = false; // Flase so that we do not revisit the place again
            fourMoves(maze, path + "D", row - 1, col);
            maze[row - 1][col - 1] = true; //backtrack

        }

        if (row < maze.length ) {
            maze[row - 1][col - 1] = false;
            fourMoves(maze, path + "U", row + 1, col);
            maze[row - 1][col - 1] = true;
        }

        if (col > 1 ) {
            maze[row - 1][col - 1] = false;
            fourMoves(maze, path + "R", row, col - 1);
            maze[row - 1][col - 1] = true;
        }

        if (col < maze[0].length ) {
            maze[row - 1][col - 1] = false;
            fourMoves(maze, path + "L", row, col + 1);
            maze[row - 1][col - 1] = true;
        }

    }

    public static void main(String[] args) {

        // boolean[][] maze =
        // {
        // { true , true , true },
        // { true , false , true },
        // { true , true , true }
        // };

        // findPaths(maze, "", 3, 3);


        boolean[][] maze = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };

        fourMoves(maze, "", 3, 3);

    }

}
