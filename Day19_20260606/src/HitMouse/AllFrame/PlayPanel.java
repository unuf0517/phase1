package HitMouse.AllFrame;

import javax.swing.*;
import java.awt.*;

public class PlayPanel extends JPanel {
    public PlayPanel(){
        setLayout(null);
        setBackground(Color.CYAN);

        JLabel jl1=new JLabel("欢迎玩家:【】");
        jl1.setBounds(455,5,130,20);
        add(jl1);

        JLabel jl2=new JLabel("【温馨提示】:游戏时间为60s，在游戏时");
        JLabel jl3=new JLabel("间内打中10次及以上即为游戏胜利");
        jl2.setBounds(455,60,10000,50);
        jl3.setBounds(455,76,10000,50);
        add(jl2);
        add(jl3);

        JLabel jl4=new JLabel("游戏倒计时:【】");
        jl4.setBounds(455,130,130,20);
        add(jl4);

        JLabel jl5=new JLabel("地鼠出现次数:【】");
        jl5.setBounds(455,190,130,20);
        add(jl5);

        JLabel jl6=new JLabel("目标击中次数:【】");
        jl6.setBounds(455,250,130,20);
        add(jl6);

        JLabel jl7=new JLabel("当前得分:【】");
        jl7.setBounds(455,310,130,20);
        add(jl7);

    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image image = new ImageIcon("Day19_20260606\\src\\HitMouse\\imagesM\\beijing.jpg").getImage();
        g.drawImage(image,0,0,450,450,null);
    }
}
