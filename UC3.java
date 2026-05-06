package TicTacToe_App;

import java.util.Scanner;

public class UC3 {

    public static int getSlotInput(Scanner sc) {
        while (true) {
            if (sc.hasNextInt()) {
                int slot = sc.nextInt();
                if (slot >= 1 && slot <= 9) {
                    return slot;
                }
            } else {
                sc.next();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int slot = getSlotInput(sc);
        System.out.println("Slot: " + slot);
    }
}
