package HitMouse.AllFrame;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(){
        playFrame();
    }

    public void myFrame() {
        setSize(450, 350);
        setTitle("打地鼠-登录");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        MyPanel myPanel = new MyPanel();
        add(myPanel);
        setVisible(true);
    }

    public void enrollFrame(){
        setSize(450, 350);
        setTitle("打地鼠-注册");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        EnrollPanel enrollPanel=new EnrollPanel();
        add(enrollPanel);
        setVisible(true);
    }

    public void playFrame() {
        setSize(700, 450);
        setTitle("打地鼠");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        PlayPanel pp = new PlayPanel();
        add(pp);
        initMenu();
        setVisible(true);
    }

    private void initMenu(){
        JMenuBar jb=new JMenuBar();

        JMenu operationMenu=new JMenu("操作");
        JMenu aboutMenu=new JMenu("关于");

        JMenuItem startItem=new JMenuItem("开始游戏");
        JMenuItem stopItem=new JMenuItem("暂停游戏");
        JMenuItem restarItem=new JMenuItem("重新开始");
        JMenuItem exitItem=new JMenuItem("退出登录");
        JMenuItem writerItem=new JMenuItem("关于作者");
        JMenuItem aboutGameItem=new JMenuItem("关于游戏");

        operationMenu.add(startItem);
        operationMenu.add(stopItem);
        operationMenu.add(restarItem);
        operationMenu.add(exitItem);
        aboutMenu.add(writerItem);
        aboutMenu.add(aboutGameItem);

        jb.add(operationMenu);
        jb.add(aboutMenu);

        setJMenuBar(jb);
    }
}
