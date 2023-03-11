package Recursion.Questions;
// https://leetcode.com/problems/word-search/

public class WordSearch {

    public static boolean exist(char[][] board, String word) {

        if( word.length() > board.length * board[0].length ) return false;


        char[] wrd = word.toCharArray();// Convert to char array for found function

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[i].length; j++) {

                if (board[i][j] == wrd[0]){

                    if(checkWord(i, j, word, 's', board))
                        return true;

                    // if( found(i, j, board, wrd, 0, new boolean[board.length][board[0].length] ) )
                    // return true;
                    
                }
            }

        }

        return false;

    }

    // My Approach
    private static boolean checkWord(int row, int col, String word, char move, char[][] board) {

        //if value is not equal to desired char return
        if (board[row][col] != word.charAt(0) || board[row][col] == '#') 
            return false;

        // if value is equal and is last letter then return true
        if( word.length() == 1 ){
            return true;
        }

        //change the value once you visited it so that we cannot use that again ( constraint given in description --> cannot use already used value )
        board[row][col] = (char) (board[row][col] - '0');

        if( move != 'd' ){            // if move is not down ( cannot go again up beacuse it is already visited)
            if( row > 0 )
                if( checkWord(row - 1, col, word.substring(1), 'u', board) ) 
                    return true ; 
        }

        if( move != 'u' ){            // if move is not up
            if( row < board.length-1 )
                if (checkWord(row + 1, col, word.substring(1), 'd', board))
                    return true ; 
        }

        if( move != 'r' ){            // if move is not right
            if( col > 0 )
                if (checkWord(row , col - 1, word.substring(1), 'l', board))
                    return true ; 
        }

        if( move != 'l' ){            // if move is not left
            if( col < board[row].length - 1 )
                if (checkWord(row , col + 1, word.substring(1), 'r', board) )
                    return true ; 
        }

        board[row][col] = (char) (board[row][col] + '0'); //backtrack if it is false

        return false;

    }


    // Better Approacah
    private static int[] directions = { 0 , -1 , 0 , 1 , 0 };
    private static boolean found( int row  , int col , char[][] board , char[] wrd ,  int index  , boolean[][] visited){

        if( index == wrd.length ) return true; // if last letter return true
     
        if( row < 0 || col < 0 || row == board.length || col == board[0].length || board[row][col] != wrd[index] || visited[row][col] ) return false;
        
        visited[row][col] = true; // so that we do not use that value again

        for (int i = 0; i < 4; i++) {
            
            if( found(row + directions[i] , col + directions[i + 1] , board , wrd, index+1, visited) )
                return true;

        }

        visited[row][col] = false; //backtrack
        return false;
    }

    public static void main(String[] args) {

        // char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
        char[][] board = { {'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'} };
        // char[][] board = { {'a','a','a','a'},{'a','a','a','a'},{'a','a','a','a'} };
        // char[][] board = { {'a','a','b','a','a','b'},{'a','a','b','b','b','a'},{'a','a','a','a','b','a'},{'b','a','b','b','a','b'},{'a','b','b','a','b','a'},{'b','a','a','a','a','b'} };
        // char[][] board = { {'C','A','A'},{'A','A','A'},{'B','C','D'} };

        String word = "ABCCED";

        System.out.println(exist(board, word));

    }

}