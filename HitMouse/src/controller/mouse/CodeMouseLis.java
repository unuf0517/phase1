package controller.mouse;

import controller.GameController;
import view.GameUI;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CodeMouseLis extends MouseAdapter {
    private GameController gameController;

    public CodeMouseLis(GameController gameController){
        this.gameController=gameController;
    }

    @Override
    public void mouseClicked(MouseEvent e){
        //1.获取验证码
        String code=gameController.yzm();
        //2.获取验证码标签
        GameUI.loginFrame.getLoginPanel().getShowCodeLabel().setText(code);
    }

}
