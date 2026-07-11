package controller;

import java.awt.*;

public class GameMap {
    private Point[] map={
            new Point(70,110),
            new Point(205,110),
            new Point(339,110),
            new Point(35,200),
            new Point(180,200),
            new Point(325,200),
            new Point(60,290),
            new Point(205,290),
            new Point(350,290)
    };

    public Point getMap(int index){
        return map[index];
    }
}
