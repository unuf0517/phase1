package HitMouse.AllFrame;

import javax.swing.*;
import java.awt.*;

public class EnrollPanel extends JPanel{
    public EnrollPanel() {
        //setBackground(Color.blue);
        setLayout(null);
        JLabel label = new JLabel("昵称:");
        label.setBounds(120, 90, 50, 20);
        add(label);
        JTextField jtf=new JTextField();
        jtf.setBounds(150, 90, 130, 20);
        add(jtf);

        JLabel label1 = new JLabel("账号:");
        label1.setBounds(120, 120, 50, 20);
        add(label1);
        JTextField jtf1=new JTextField();
        jtf1.setBounds(150, 120, 130, 20);
        add(jtf1);


        JLabel label2=new JLabel("密码:");
        label2.setBounds(120,150,50,20);
        add(label2);
        JPasswordField jpf=new JPasswordField();
        jpf.setBounds(150, 150, 130, 20);
        add(jpf);


        JLabel label3=new JLabel("确认密码:");
        label3.setBounds(95,180,60,20);
        add(label3);
        JPasswordField jpf1=new JPasswordField();
        jpf1.setBounds(150, 180, 130, 20);
        add(jpf1);


        JButton jb=new JButton("登录");
        jb.setBounds(110, 210, 80, 30);
        add(jb);

        JButton jb2=new JButton("注册");
        jb2.setBounds(210, 210, 80, 30);
        add(jb2);

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image image = new ImageIcon("Day19_20260606\\src\\HitMouse\\imagesM\\bk2.jpg").getImage();
        g.drawImage(image,0,0,450,350,null);
    }
}
