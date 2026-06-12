package HitMouse.Game;

import HitMouse.Mouse.BaseMouse;
import HitMouse.Prop.Bomb;
import HitMouse.Prop.Treat;

public class GameMap {
    private String[][] map;
    private int row;
    private int col;

    public void initMap(int level){
        switch(level){
            case 1:
                System.out.println("你选择的难度是初级：");
                map = new String[5][5];
                row=5;
                col=5;
                break;
            case 2:
                System.out.println("你选择的难度是中级：");
                map = new String[10][10];
                row=10;
                col=10;
                break;
            case 3:
                System.out.println("你选择的难度是高级：");
                map = new String[20][20];
                row=20;
                col=20;
                break;
            default:
                System.out.println("输入有误，默认选择初级");
                map = new String[5][5];
                row=5;
                col=5;
        }
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = "🕳️";
            }
        }
        printMap();
    }
    public void printMap(){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void resetMap(int row,int col){
        map[row][col]="🕳️";
    }

    public void setMap(int row, int col, BaseMouse baseMouse) {
        map[row][col] = baseMouse.getType();
    }

    public void setBombMap(Bomb[] bombs) {
        if (bombs == null) {
            return;
        }
        for (int i = 0; i < bombs.length; i++) {
            if (bombs[i] == null) {
                continue;
            }
            map[bombs[i].getRow()][bombs[i].getCol()] = "\uD83D\uDCA3";
        }
    }

    public void setTreatMap(Treat[] treats) {
        if (treats == null) {
            return;
        }
        for (int i = 0; i < treats.length; i++) {
            if (treats[i] == null) {
                continue;
            }
            map[treats[i].getRow()][treats[i].getCol()] = "❤️";
        }
    }


    public String[][] getMap() {
        return map;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

}
