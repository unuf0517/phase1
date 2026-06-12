package HitMouse.Mouse;

import java.util.Random;

public class BaseMouse {
    private int score;
    private int row;
    private int col;
    private String type;
    Random r = new Random();

    public BaseMouse(int score,String type) {
        this.score = score;
        this.type = type;
    }

    public void createMouse(int mapRow, int mapCol){
        row = r.nextInt(mapRow);
        col = r.nextInt(mapCol);

    }

    public int getScore() {
        return score;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public String getType() {return type;}
}
