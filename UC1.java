package TicTacToe_App;

import java.util.Scanner;

public class UC1 {

    // Method to initialize the board
    public static void initializeBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {          // rows
            for (int j = 0; j < 3; j++) {      // columns
                board[i][j] = '-';             // empty placeholder
            }
        }
    }

    // Method to display the board
    public static void displayBoard(char[][] board) {
        System.out.println("\nTic-Tac-Toe Board:\n");

        for (int i = 0; i < 3; i++) {          // rows
            for (int j = 0; j < 3; j++) {      // columns
                System.out.print(board[i][j] + " ");
            }
            System.out.println();              // move to next row
        }
    }

    public static void main(String[] args) {

        // Step 1: Create board (2D array)
        char[][] board = new char[3][3];

        // Step 2: Initialize board with '-'
        initializeBoard(board);

        // Step 3: Display board
        displayBoard(board);
    }
}