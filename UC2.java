package TicTacToe_App;

import java.util.Random;

public class UC2 {

    static String currentPlayer;
    static char currentSymbol;
    static char player1Symbol;
    static char player2Symbol;

    public static void toss() {
        Random rand = new Random();
        int result = rand.nextInt(2);

        if (result == 0) {
            currentPlayer = "Player 1";
            currentSymbol = 'X';
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            currentPlayer = "Player 2";
            currentSymbol = 'X';
            player2Symbol = 'X';
            player1Symbol = 'O';
        }

        System.out.println(currentPlayer + " starts with " + currentSymbol);
    }

    public static void main(String[] args) {
        toss();
    }
}
