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
                //获取老鼠对象
                Mouse mouse=GameController.getInstance().getMouse();

                //设置老鼠状态为未打中
                mouse.setMouseStatus(false);
                mouse.mouseImageToStatus();

                //获取一个随机索引
                int index=new Random().nextInt(9);
                //获取点对象
                Point point= GameController.getInstance().getGameMap().getMap(index);

                //给老鼠对象设置坐标
                mouse.setMouseX(point.x);
                mouse.setMouseY(point.y);

                //更新老鼠出现次数
                GameController.getInstance().setMouseNumber(GameController.getInstance().getMouseNumber() + 1);
                GameUI.gameFrame.getGameInformationPanel().getAppearNumberLabel().setText("【"+GameController.getInstance().getMouseNumber()+"】次");

                //游戏倒计时
                GameController.getInstance().setGameTime(GameController.getInstance().getGameTime() - 1);
                GameUI.gameFrame.getGameInformationPanel().getTimeLabel().setText("【"+GameController.getInstance().getGameTime()+"】秒");

                //属性页面
                GameUI.gameFrame.getGameCenterPanel().repaint();
            }
        });
    }

    public Timer getTimer() {
        return timer;
    }
}
