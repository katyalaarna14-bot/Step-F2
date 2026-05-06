package TicTacToe_App;

public class UC9 {

    public static boolean checkWin(char[][] board, char s) {

        for (int i=0;i<3;i++) {
            if (board[i][0]==s && board[i][1]==s && board[i][2]==s) return true;
        }

        for (int i=0;i<3;i++) {
            if (board[0][i]==s && board[1][i]==s && board[2][i]==s) return true;
        }

        if (board[0][0]==s && board[1][1]==s && board[2][2]==s) return true;
        if (board[0][2]==s && board[1][1]==s && board[2][0]==s) return true;

        return false;
    }

    public static void main(String[] args) {
        char[][] board = {
            {'X','X','X'},
            {'O','-','O'},
            {'-','-','-'}
        };

        System.out.println(checkWin(board,'X'));
    }
}