package HitMouse.AllFrame;

import HitMouse.Game.yzm;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    public MyPanel() {
        //setBackground(Color.blue);
        setLayout(null);
        JLabel label = new JLabel("账号:");
        label.setBounds(120, 100, 50, 20);
        add(label);

        JLabel label2=new JLabel("密码:");
        label2.setBounds(120,130,50,20);
        add(label2);

        JLabel label3=new JLabel("验证码:");
        label3.setBounds(105,160,50,20);
        add(label3);


        JButton jb=new JButton("登录");
        jb.setBounds(100, 200, 80, 30);
        add(jb);

        JButton jb2=new JButton("注册");
        jb2.setBounds(200, 200, 80, 30);
        add(jb2);

        String s= yzm.yzm();
        JButton jb3=new JButton(s);
        jb3.setBounds(225,160,65,20);
        add(jb3);


        JTextField jtf=new JTextField();
        jtf.setBounds(150, 100, 130, 20);
        add(jtf);

        JPasswordField jpf=new JPasswordField();
        jpf.setBounds(150, 130, 130, 20);
        add(jpf);

        JTextField yzm=new JTextField();
        yzm.setBounds(150,160,70,20);
        add(yzm);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image image = new ImageIcon("Day19_20260606\\src\\HitMouse\\imagesM\\bk2.jpg").getImage();
        g.drawImage(image,0,0,450,350,null);
    }
}