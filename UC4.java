package TicTacToe_App;
public class UC4 {

    public static int[] getRowCol(int slot) {
        int index = slot - 1;
        return new int[]{index / 3, index % 3};
    }

    public static void main(String[] args) {
        int[] pos = getRowCol(5);
        System.out.println(pos[0] + " " + pos[1]);
    }
}