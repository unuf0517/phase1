package controller.action;

import com.sun.jdi.PathSearchingVirtualMachine;
import com.sun.source.util.SourcePositions;
import controller.GameController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuActionLis implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "start":
                System.out.println("开始游戏");
                GameController.getInstance().getGameTimer().getTimer().start();
                break;
            case "stop":
                System.out.println("暂停游戏");
                break;
            case "restart":
                System.out.println("重新开始");
                break;
            case "exit":
                System.out.println("退出登录");
                break;
            case "writer":
                System.out.println("关于作者");
                break;
            case "aboutGame":
                System.out.println("关于游戏");
                break;
            default:
                System.out.println("未知操作");
        }
    }
}
