//package controller.mouse;
//
//import controller.GameController;
//import model.Palyer.HitmouseDO;
//import view.GameUI;
//
//import javax.swing.*;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//
//public class LoginMouseLis extends MouseAdapter {
//
//    private GameController gameController;
//    public LoginMouseLis(GameController gameController){
//        this.gameController=gameController;
//    }
//    //适配器模式
//    @Override
//    public void mouseClicked(MouseEvent e){
//        /*获取账号密码
//        1.获取页面统一管理
//        2.通过GameUI获取登录窗口
//        3.通过登录窗口获取登录面板
//        4.通过登录面板获取账号输入框
//        5.获取输入框数据
//         */
//        try {
//            String account= GameUI.loginFrame.getLoginPanel().getAccountTextField().getText();
//            String password=new String(GameUI.loginFrame.getLoginPanel().getPasswordTextField().getPassword());
//            String code=GameUI.loginFrame.getLoginPanel().getCodeTextField().getText();
//
//            if(account.equals("") || password.equals("") || code.equals("")){
//                JOptionPane.showMessageDialog(null,"请填写完整数据","温馨提示",JOptionPane.PLAIN_MESSAGE);
//                return;
//            }
//
//            //判断验证码是否正确
//            //获取用户输入的验证码
//            String showCode=GameUI.loginFrame.getLoginPanel().getShowCodeLabel().getText();
//            if(!showCode.equalsIgnoreCase(code)){
//                JOptionPane.showMessageDialog(null,"验证码错误","温馨提示",JOptionPane.PLAIN_MESSAGE);
//                return;
//            }
//
//            HitmouseDO hitmouseDO = GameController.login(account, password);
//
//            if (hitmouseDO != null) {
//
//                JOptionPane.showMessageDialog(null,"登陆成功","温馨提示",JOptionPane.PLAIN_MESSAGE);
//
//                //页面跳转  关闭登录页面  开启游戏页面
//                GameUI.loginFrame.setVisible(false);
//                GameUI.gameFrame.setVisible(true);
//            } else {
//                JOptionPane.showMessageDialog(null,"登陆失败","温馨提示",JOptionPane.ERROR_MESSAGE);
//            }
//        } catch (Exception E) {
//            E.printStackTrace();
//            JOptionPane.showMessageDialog(null, "系统异常：" + E.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
//        }
//
//    }
//}
