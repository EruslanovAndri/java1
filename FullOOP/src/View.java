



import Unit.Hero;

import java.util.Collections;

public class View {
    private static int step = 1;
    private static final int[] l = {0};
    private static final String top10 = formatDiv("a") + String.join("", Collections.nCopies(9, formatDiv("-b"))) + formatDiv("-c");
    private static final String midl10 = formatDiv("d") + String.join("", Collections.nCopies(9, formatDiv("-e"))) + formatDiv("-f");
    private static final String bottom10 = formatDiv("g") + String.join("", Collections.nCopies(9, formatDiv("-h"))) + formatDiv("-i");
    private static void tabSetter(){
        System.out.print(" \t|\t");
    }
    private static String formatDiv(String str) {
        return str.replace('a', '┌')
                .replace('b', '┬')
                .replace('c', '┐')
                .replace('d', '├')
                .replace('e', '┼')
                .replace('f', '┤')
                .replace('g', '└')
                .replace('h', '┴')
                .replace('i', '┘')
                .replace('-', '─');
    }
    private static String getChar(int x, int y){
        String out = "| ";
        for (Hero hero: Main.teams) {
            if (hero.getCoords()[0] == x && hero.getCoords()[1] == y){
                if (hero.getHp() == 0) {
                    out = "|" + (AnsiColors.ANSI_RED + hero.getInfo().charAt(0) + AnsiColors.ANSI_RESET);
                    break;
                }
                if (Main.team2.contains(hero)) out = "|" + (AnsiColors.ANSI_YELLOW + hero.getInfo().charAt(0) + AnsiColors.ANSI_RESET);
                if (Main.team1.contains(hero)) out = "|" + (AnsiColors.ANSI_GREEN + hero.getInfo().charAt(0) + AnsiColors.ANSI_RESET);
                break;
            }
        }
        return out;
    }
    static void searchWinner (int teamSize) {
        Main.teams.forEach((v) -> l[0] = Math.max(l[0], v.toString().length()));
        for (int i = 0; i < (l[0]*3-10)/2; i++) System.out.print(AnsiColors.ANSI_PURPLE + "*");
        System.out.printf(AnsiColors.ANSI_CYAN + "%s",
                teamSize == 0? ">>> Победила Yellow side <<<" : ">>> Победила Green side <<<");
        for (int i = 0; i < (l[0]*3-10)/2; i++) System.out.print(AnsiColors.ANSI_PURPLE + "*");
        System.out.println(AnsiColors.ANSI_RESET);
    }
    public static void view() {
        if (step == 1 ){
            System.out.print(AnsiColors.ANSI_RED + "First step" + AnsiColors.ANSI_RESET);
        } else {
            System.out.print(AnsiColors.ANSI_RED + "Step:" + step + AnsiColors.ANSI_RESET);
        }
        step++;
        Main.teams.forEach((v) -> l[0] = Math.max(l[0], v.toString().length()));
        for (int i = 0; i < l[0]*3; i++) System.out.print("_");
        System.out.println();
        System.out.print(top10 + "\t");
        System.out.print(AnsiColors.ANSI_YELLOW + "Yellow side" + AnsiColors.ANSI_RESET);
        for (int i = 0; i < l[0]; i++) System.out.print(" ");
        System.out.println(AnsiColors.ANSI_GREEN + "\tGreen side" + AnsiColors.ANSI_RESET);
        for (int i = 1; i < 11; i++) {
            System.out.print(getChar(1, i));
        }
        System.out.print("|\t");
        System.out.print(AnsiColors.ANSI_YELLOW + Main.team2.get(0) + AnsiColors.ANSI_RESET);
        tabSetter();
        System.out.println(AnsiColors.ANSI_GREEN + Main.team1.get(0) + AnsiColors.ANSI_RESET);
        System.out.println(midl10);

        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(getChar(i, j));
            }
            System.out.print("|\t");
            System.out.print(AnsiColors.ANSI_YELLOW + Main.team2.get(i-1) + AnsiColors.ANSI_RESET);
            tabSetter();
            System.out.println(AnsiColors.ANSI_GREEN + Main.team1.get(i-1) + AnsiColors.ANSI_RESET);
            System.out.println(midl10);
        }
        for (int j = 1; j < 11; j++) {
            System.out.print(getChar(10, j));
        }
        System.out.print("|\t");
        System.out.print(AnsiColors.ANSI_YELLOW + Main.team2.get(9) + AnsiColors.ANSI_RESET);
        tabSetter();
        System.out.println(AnsiColors.ANSI_GREEN + Main.team1.get(9) + AnsiColors.ANSI_RESET);
        System.out.println(bottom10);
    }
}