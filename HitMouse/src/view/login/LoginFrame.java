package view.login;


import controller.GameController;
import view.GameUI;

import javax.swing.*;

public class LoginFrame extends JFrame {
    //登录面板
    private LoginPanel loginPanel;
    private GameController gameController;

    /**
     * @description: 空参构造
     * @return: null
     */
    public LoginFrame(GameController gameController) {
        this.gameController=gameController;
        //初始化页面
        initFrame();

        //页面可视化
        setVisible(true);

    }

    /**
     * @description: 初始化页面
     * @return: void
     */
    private void initFrame() {
        //设置窗口大小
        setSize(450, 430);
        //设置标题
        setTitle("登录页面");
        //固定窗口大小
        setResizable(false);
        //窗口居中
        setLocationRelativeTo(null);
        //设置窗口关闭操作
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        /*
         * DO_NOTHING_ON_CLOSE   点击关闭时不做任何操作，自定义操作
         * HIDE_ON_CLOSE         点击关闭时隐藏窗口  (默认)
         * EXIT_ON_CLOSE         点击关闭时关闭窗口
         * DISPOSE_ON_CLOSE      点击关闭时隐藏窗口  释放窗口占用的资源
         *
         * */


        loginPanel = new LoginPanel(gameController);
        //添加中间面板
        add(loginPanel);

    }


    public LoginPanel getLoginPanel() {
        return loginPanel;
    }

    public void setLoginPanel(LoginPanel loginPanel) {
        this.loginPanel = loginPanel;
    }
}
