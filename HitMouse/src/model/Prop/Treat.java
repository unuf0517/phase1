package model.Prop;

import java.util.Random;

public class Treat {
    static Random r= new Random();
    private int treatRow;
    private int treatCol;

    public Treat(int row, int col) {
        this.treatRow = row;
        this.treatCol = col;
    }

    public static Treat[] createTreats(String[][] map, int count) {
        int treatCount = Math.max(1, count);
        Treat[] treats = new Treat[treatCount];
        int index = 0;
        while (index < treatCount) {
            int row = r.nextInt(map.length);
            int col = r.nextInt(map[0].length);
            if (isTreat(map[row][col], treats, index, row, col)) {
                treats[index] = new Treat(row, col);
                index++;
            }
        }
        return treats;
    }

    public static boolean isTreat(String area, Treat[] treats, int number, int row, int col) {
        if (area == null) {
            return false;
        }
        if ("\uD83D\uDCA3".equals(area) || "❤️".equals(area)) {
            return false;
        }
        for (int i = 0; i < number; i++) {
            if (treats[i].treatRow == row && treats[i].treatCol == col) {
                return false;
            }
        }
        return true;
    }

    public int getRow() {
        return treatRow;
    }

    public int getCol() {
        return treatCol;
    }
}
