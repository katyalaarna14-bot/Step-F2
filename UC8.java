package TicTacToe_App;

import java.util.Scanner;
import java.util.Random;

public class UC8 {

    static int[] getRowCol(int slot) {
        int index = slot - 1;
        return new int[]{index / 3, index % 3};
    }

    static boolean isValidMove(char[][] board, int r, int c) {
        return r >= 0 && r < 3 && c >= 0 && c < 3 && board[r][c] == '-';
    }

    static void placeMove(char[][] board, int r, int c, char sym) {
        board[r][c] = sym;
    }

    static boolean checkWin(char[][] b, char s) {
        for (int i = 0; i < 3; i++) {
            if ((b[i][0]==s && b[i][1]==s && b[i][2]==s) ||
                (b[0][i]==s && b[1][i]==s && b[2][i]==s)) return true;
        }
        return (b[0][0]==s && b[1][1]==s && b[2][2]==s) ||
               (b[0][2]==s && b[1][1]==s && b[2][0]==s);
    }

    static boolean isDraw(char[][] b) {
        for (int i=0;i<3;i++)
            for (int j=0;j<3;j++)
                if (b[i][j]=='-') return false;
        return true;
    }

    static int getUserSlot(Scanner sc) {
        while (true) {
            if (sc.hasNextInt()) {
                int s = sc.nextInt();
                if (s>=1 && s<=9) return s;
            } else sc.next();
        }
    }

    static void computerMove(char[][] b, char s) {
        Random r = new Random();
        while (true) {
            int slot = r.nextInt(9)+1;
            int[] p = getRowCol(slot);
            if (isValidMove(b,p[0],p[1])) {
                placeMove(b,p[0],p[1],s);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = {
            {'-','-','-'},
            {'-','-','-'},
            {'-','-','-'}
        };

        char current = 'X';
        boolean over = false;

        while (!over) {

            if (current=='X') {
                int slot = getUserSlot(sc);
                int[] p = getRowCol(slot);
                if (isValidMove(board,p[0],p[1]))
                    placeMove(board,p[0],p[1],current);
                else continue;
            } else {
                computerMove(board,current);
            }

            if (checkWin(board,current)) {
                System.out.println(current + " wins");
                over = true;
            } else if (isDraw(board)) {
                System.out.println("Draw");
                over = true;
            } else {
                current = (current=='X')?'O':'X';
            }
        }
    }
}
