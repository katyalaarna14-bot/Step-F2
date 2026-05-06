package TicTacToe_App;
import java.util.Random;

public class UC7 {

    public static int[] getRowCol(int slot) {
        int index = slot - 1;
        return new int[]{index / 3, index % 3};
    }

    public static boolean isValidMove(char[][] board, int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-';
    }

    public static void placeMove(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    public static void computerMove(char[][] board, char symbol) {
        Random rand = new Random();
        while (true) {
            int slot = rand.nextInt(9) + 1;
            int[] pos = getRowCol(slot);
            if (isValidMove(board, pos[0], pos[1])) {
                placeMove(board, pos[0], pos[1], symbol);
                break;
            }
        }
    }

    public static void main(String[] args) {
        char[][] board = {
            {'X','-','-'},
            {'-','O','-'},
            {'-','-','-'}
        };

        computerMove(board, 'O');
    }
}