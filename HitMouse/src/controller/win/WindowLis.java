package controller.win;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowLis extends WindowAdapter {
    @Override
    public void windowClosing(WindowEvent e) {
        int res=JOptionPane.showConfirmDialog(null, "是否退出？", "提示", JOptionPane.YES_NO_OPTION);
        if (res == 0) {
            System.exit(0);
        }
    }
}
