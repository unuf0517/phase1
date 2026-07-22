package controller.mouse;

import controller.GameController;
import controller.Mouse;
import view.GameUI;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GameMouseLis extends MouseAdapter {
    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("鼠标点击事件触发，坐标: (" + e.getX() + ", " + e.getY() + ")");

        //1.获取鼠标对象
        Mouse mouse = GameController.getInstance().getMouse();

        //2.根据老鼠的坐标大小构建出矩形
        Rectangle mouseRect = new Rectangle(mouse.getMouseX(), mouse.getMouseY(), mouse.getMouseWidth(), mouse.getMouseHeight());

        //3.判断鼠标点击的坐标是否在矩形范围内
        if (mouseRect.contains(e.getPoint())) {
            System.out.println("老鼠被击中！");
            //4.如果击中，调用击中方法
            mouse.setMouseStatus(true);
            mouse.mouseImageToStatus();

            //打中加分
            GameController.getInstance().setScore(GameController.getInstance().getScore() + 3);
            GameUI.gameFrame.getGameInformationPanel().getScoreLabel().setText("【" + GameController.getInstance().getScore() + "】分");
            //加次数
            GameController.getInstance().setHitNumber(GameController.getInstance().getHitNumber() + 1);
            GameUI.gameFrame.getGameInformationPanel().getHitNumberLabel().setText("【" + GameController.getInstance().getHitNumber() + "】次");

        }

        GameUI.gameFrame.getGameCenterPanel().repaint();
    }
}
