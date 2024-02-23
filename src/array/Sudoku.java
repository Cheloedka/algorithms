package array;

import java.util.HashSet;
import java.util.Set;

public class Sudoku {

            /*for (int i = 0; i < 9; i++) {
                Set<Character> row = new HashSet<>();
                int counter = 0;
                for (int j = 0; j < 9; j++) {
                    if (board[i][j] != '.') {
                        row.add(board[i][j]);
                        counter = counter + 1;
                    }
                }
                if (row.size() != counter) {
                    return false;
                }
            }

            for (int i = 0; i < 9; i++) {
                Set<Character> column = new HashSet<>();
                int counter = 0;
                for (int j = 0; j < 9; j++) {
                    if (board[j][i] != '.') {
                        column.add(board[j][i]);
                        counter = counter + 1;
                    }
                }
                if (column.size() != counter) {
                    return false;
                }
            }

            for (int i = 0; i < 9; i = i + 3) {
                Set<Character> block = new HashSet<>();
                int counter = 0;
                int rowCounter = 0;
                int columnCounter = 0;
                for (int j = 0; j <= 9; j++) {

                    if (rowCounter == 3) {
                        i = i + 1;
                        j = j - 3;
                        rowCounter = 0;
                        columnCounter = columnCounter + 1;
                    }
                    if (columnCounter == 3) {
                        if (block.size() != counter){
                            return false;
                        }
                        block.clear();
                        counter = 0;
                        j = j + 3;
                        i = i - 3;
                        columnCounter = 0;
                    }
                    if ( j < 9) {
                        if (board[i][j] != '.') {
                            block.add(board[i][j]);
                            counter = counter + 1;
                        }
                    }


                    rowCounter = rowCounter + 1;
                }
            }
            return true*/

    public static boolean checkBlock(int iB, int jB, char[][] board) {
        Set<Character> blockSet = new HashSet<>();
        int rows = iB + 3;
        int cols = jB + 3;
        for (int i = iB; i < rows; i++) {
            for (int j = jB; j < cols; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (blockSet.contains(board[i][j])) {
                    return false;
                }
                blockSet.add(board[i][j]);
            }
        }
        return true;
    }

    public static void main(String[] args) {

        char[][] board = {
         {'5','3','.','.','7','.','.','.','.'}
        ,{'6','.','.','1','9','5','.','.','.'}
        ,{'.','9','8','.','.','.','.','6','.'}
        ,{'8','.','.','.','6','.','.','.','3'}
        ,{'4','.','.','8','.','3','.','.','1'}
        ,{'7','.','.','.','2','.','.','.','6'}
        ,{'.','6','.','.','.','.','2','8','.'}
        ,{'.','.','.','4','1','9','.','.','5'}
        ,{'.','.','.','.','8','.','.','7','9'}};

        for (int i = 0; i < 9; i++) {
            Set<Character> row = new HashSet<>();
            Set<Character> column = new HashSet<>();
            int counterR = 0;
            int counterC = 0;
            for (int j = 0; j < 9; j++) {
                char r = board[i][j];
                char c = board[j][i];
                if (r != '.'){
                    row.add(r);
                    counterR++;
                }
                if (c != '.'){
                    column.add(c);
                    counterC++;
                }
            }
            if (counterC != column.size()) {
            }
            if ( counterR != row.size()) {
            }

        }

        for (int i = 0; i < 9; i = i + 3) {
            for (int j = 0; j < 9; j = j + 3) {
                if (!checkBlock(i, j, board)) {
                }
            }
        }

    }
}
