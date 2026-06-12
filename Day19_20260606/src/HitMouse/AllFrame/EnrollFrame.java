package HitMouse.AllFrame;

import javax.swing.*;

public class EnrollFrame extends JFrame{
    public EnrollFrame() {
        setSize(450, 350);
        setTitle("打地鼠-注册");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        EnrollPanel enrollPanel=new EnrollPanel();
        add(enrollPanel);
        setVisible(true);
    }
}
