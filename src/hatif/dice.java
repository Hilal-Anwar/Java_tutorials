
package hatif;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class dice {
    public static void main(String[] args) throws IOException, InterruptedException {
        String[][] dice = new String[9][9];
        for (int i = 0; i < dice.length; i++) {
            if (i == 0 || i == dice.length - 1) {
                Arrays.fill(dice[i], "██");

            } else {
                dice[i][0] = "██";
                dice[i][dice[i].length - 1] = "██";
            }
        }
        String value;
        try (var scanner = new Scanner(System.in)) {
            while (true) {
                int dice_no = (int) (Math.random() * 6 + 1);
                System.out.println("Press enter to role dice or enter 'e' to exit");
                value = scanner.nextLine();
                if (value.equalsIgnoreCase("e"))
                    break;
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
        }
    }

    static void clear_the_screen() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}
