
package tutorials_13;

import java.util.Arrays;
import java.util.Scanner;

class dice {
    public static void main(String[] args) {
        String[][] dice = new String[9][9];
        init_dice(dice);
        String value;
        try (var scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Press enter to role dice or enter 'e' to exit");
                value = scanner.nextLine();
                if (value.equalsIgnoreCase("e"))
                    break;
                play(dice);
            }
        }
    }

    private static void play(String[][] dice) {
        int dice_no = (int) (Math.random() * 6 + 1);
        StringBuilder text = new StringBuilder();
        int half = dice.length / 2;
        int end = dice.length - 3;
        int start = 2;
        switch (dice_no) {
            case 1 -> dice[half][half] = "● ";
            case 2 -> {
                dice[start][start] = "● ";
                dice[end][end] = " ●";
            }
            case 3 -> {
                dice[start][start] = "● ";
                dice[half][half] = "● ";
                dice[end][end] = " ●";
            }
            case 4 -> {
                dice[start][start] = "● ";
                dice[start][end] = " ●";
                dice[end][start] = "● ";
                dice[end][end] = " ●";
            }
            case 5 -> {
                dice[start][start] = "● ";
                dice[start][end] = " ●";
                dice[half][half] = "● ";
                dice[end][start] = "● ";
                dice[end][end] = " ●";
            }
            case 6 -> {
                dice[start][start] = "● ";
                dice[start][end] = " ●";
                dice[half][start] = "● ";
                dice[half][end] = " ●";
                dice[end][start] = "● ";
                dice[end][end] = " ●";
            }
            default -> throw new IllegalStateException("Unexpected value: " + dice_no);
        }
        clear_the_screen();
        print_dice(dice, text, half, end, start);
    }

    private static void print_dice(String[][] dice, StringBuilder text, int half, int end, int start) {
        for (String[] die : dice) {
            for (int j = 0; j < dice[0].length; j++) {
                text.append((die[j] != null) ? die[j] : "  ");
            }
            text.append('\n');
        }
        System.out.println(text);
        dice[half][half] = null;
        dice[end][end] = null;
        dice[start][start] = null;
        dice[start][end] = null;
        dice[end][start] = null;
        dice[half][start] = null;
        dice[half][end] = null;
    }

    private static void init_dice(String[][] dice) {
        for (int i = 0; i < dice.length; i++) {
            if (i == 0 || i == dice.length - 1) {
                Arrays.fill(dice[i], "██");

            } else {
                dice[i][0] = "██";
                dice[i][dice[i].length - 1] = "██";
            }
        }
    }

    static void clear_the_screen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
