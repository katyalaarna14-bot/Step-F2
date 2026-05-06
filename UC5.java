package TicTacToe_App;

public class UC5 {

    public static boolean isValidMove(char[][] board, int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2) return false;
        return board[row][col] == '-';
    }

    public static void main(String[] args) {
        char[][] board = {
            {'X','-','O'},
            {'-','X','-'},
            {'O','-','-'}
        };

        System.out.println(isValidMove(board, 1, 1));
    }
}
