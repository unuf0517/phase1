package view.game;


import controller.GameController;
import controller.Mouse;

import javax.swing.*;
import java.awt.*;

/**
 * @BelongsProject: HitMouse
 * @BelongsPackage: org.wql.view.game
 * @Author: 阿隆
 * @CreateTime: 2024-04-18  11:27
 * @Description: 游戏中心面板
 * @Version: 1.0
 */
public class GameCenterPanel extends JPanel {


    /**
     * @description: 构造方法
     * @return: null
     */
    public GameCenterPanel() {

    }

    /**
     * @description: 绘制
     * @Param g:
     * @return: void
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //创建图片实例
        Image backgroundImage = new ImageIcon("HitMouse/src/imagesM/beijing.jpg").getImage();
        //绘制图片
        g.drawImage(backgroundImage, 0, 0, 455, 450, null);

        Mouse mouse= GameController.getInstance().getMouse();
        g.drawImage(mouse.getMouseImage(), mouse.getMouseX(), mouse.getMouseY(), mouse.getMouseWidth(), mouse.getMouseHeight(), null);


/*
        Image noHitMouseImage = new ImageIcon("HitMouse/src/imagesM/dishu.png").getImage();
        g.drawImage(noHitMouseImage,70,110,59,69,null);
        g.drawImage(noHitMouseImage,205,110,59,69,null);
        g.drawImage(noHitMouseImage,339,110,59,69,null);
        g.drawImage(noHitMouseImage,35,200,59,69,null);
        g.drawImage(noHitMouseImage,180,200,59,69,null);
        g.drawImage(noHitMouseImage,325,200,59,69,null);
        g.drawImage(noHitMouseImage,60,290,59,69,null);
        g.drawImage(noHitMouseImage,205,290,59,69,null);
        g.drawImage(noHitMouseImage,350,290,59,69,null);

 */
    }
}
