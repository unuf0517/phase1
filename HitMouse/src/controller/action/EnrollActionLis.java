package controller.action;

import controller.GameController;
import view.GameUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EnrollActionLis implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "enrollBtn":
                //注册按钮点击事件
                String nickname=GameUI.enrollFrame.getEnrollPanel().getNicknameTextField().getText();
                String account=GameUI.enrollFrame.getEnrollPanel().getAccountTextField().getText();
                String password=new String(GameUI.enrollFrame.getEnrollPanel().getPasswordTextField().getPassword());
                String confirmPassword=new String(GameUI.enrollFrame.getEnrollPanel().getConfirmPasswordTextField().getPassword());

                if(nickname.equals("") || account.equals("") || password.equals("") || confirmPassword.equals("")){
                    JOptionPane.showMessageDialog(null,"请填写完整数据","温馨提示",JOptionPane.PLAIN_MESSAGE);
                    return;
                }
                if(!password.equals(confirmPassword)){
                    JOptionPane.showMessageDialog(null,"两次密码不一致","温馨提示",JOptionPane.PLAIN_MESSAGE);
                    return;
                }

                int result= GameController.enroll(nickname, account, password);
                if(result==2){
                    JOptionPane.showMessageDialog(null,"注册成功","温馨提示",JOptionPane.PLAIN_MESSAGE);
                    GameUI.enrollFrame.setVisible(false);
                    GameUI.loginFrame.setVisible(true);
                }else if(result==3){
                    JOptionPane.showMessageDialog(null,"注册失败","温馨提示",JOptionPane.PLAIN_MESSAGE);
                }else if(result==1) {
                    JOptionPane.showMessageDialog(null, "账号已存在", "温馨提示", JOptionPane.PLAIN_MESSAGE);
                }
                break;
            case "loginBtn":
                //登录按钮点击事件
                GameUI.enrollFrame.setVisible(false);
                GameUI.loginFrame.setVisible(true);
                break;
        }
    }
}
