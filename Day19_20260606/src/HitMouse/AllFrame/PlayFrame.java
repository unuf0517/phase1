package HitMouse.AllFrame;

import javax.swing.*;
import java.awt.*;

public class PlayFrame extends JFrame {
    public PlayFrame(){
        setSize(450, 350);
        setTitle("打地鼠");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        PlayPanel pp=new PlayPanel();
        add(pp, BorderLayout.WEST);
        setVisible(true);
    }
}
