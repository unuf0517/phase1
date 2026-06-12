package HitMouse.Prop;

import java.util.Random;

public class Bomb {
    static Random r= new Random();
    private int bombRow;
    private int bombCol;

    public Bomb(int row, int col) {
        this.bombRow = row;
        this.bombCol = col;
    }

    public static Bomb[] createBombs(String[][] map, int count) {
        int bombCount = Math.max(2, count);
        Bomb[] bombs = new Bomb[bombCount];
        int index = 0;
        while (index < bombCount) {
            int row = r.nextInt(map.length);
            int col = r.nextInt(map[0].length);
            if (isBomb(map[row][col], bombs, index, row, col)) {
                bombs[index] = new Bomb(row, col);
                index++;
            }
        }
        return bombs;
    }

    public static boolean isBomb(String area, Bomb[] bombs, int number, int row, int col) {
        if (area == null) {
            return false;
        }
        if ("\uD83D\uDCA3".equals(area)) {
            return false;
        }
        for (int i = 0; i < number; i++) {
            if (bombs[i].bombRow == row && bombs[i].bombCol == col) {
                return false;
            }
        }
        return true;
    }

    public int getRow() {
        return bombRow;
    }

    public int getCol() {
        return bombCol;
    }
}
