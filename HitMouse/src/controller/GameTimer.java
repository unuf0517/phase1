package controller;

import view.GameUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GameTimer {
    private Timer timer;

    public GameTimer(){
        timer=new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index=new Random().nextInt(9);

                //获取点对象
                Point point= GameController.getInstance().getGameMap().getMap(index);
                //获取老鼠对象
                Mouse mouse=GameController.getInstance().getMouse();
                //给老鼠对象设置坐标
                mouse.setMouseX(point.x);
                mouse.setMouseY(point.y);
                //属性页面
                GameUI.gameFrame.getGameCenterPanel().repaint();
            }
        });
    }

    public Timer getTimer() {
        return timer;
    }
}
