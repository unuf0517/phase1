package view.login;


import controller.GameController;
import controller.action.LoginActionLis;
import controller.mouse.CodeMouseLis;

import javax.swing.*;
import java.awt.*;

public class LoginPanel extends JPanel {
    //字体样式
    private final Font FONT = new Font("微软雅黑", Font.BOLD, 16);
    //账号标签
    private JLabel accountLabel = new JLabel("账号:");
    //密码标签
    private JLabel passwordLabel = new JLabel("密码:");
    //验证码标签
    private JLabel codeLabel = new JLabel("验证码:");
    //显示验证码标签
    private JLabel showCodeLabel;
    //账号文本框
    private JTextField accountTextField = new JTextField();
    //密码框
    private JPasswordField passwordTextField = new JPasswordField();
    //验证码文本框
    private JTextField codeTextField = new JTextField();
    //登录按钮
    private JButton loginBtn = new JButton("登录");
    //注册按钮
    private JButton enrollBtn = new JButton("注册");

    private GameController gameController;

    /**
     * @description: 构造方法
     * @return: null
     */
    public LoginPanel(GameController gameController) {
        this.gameController=gameController;
        //设置为自由布局
        setLayout(null);

        //调用添加标签方法
        addModule();


    }


    /**
     * @description: 添加标签
     * @return: void
     */
    private void addModule() {
        /*
         * 账号标签
         * */
        //设置账号标签位置大小
        accountLabel.setBounds(50, 50, 50, 50);
        //设置账号标签的字体样式
        accountLabel.setFont(FONT);
        //添加账号标签
        add(accountLabel);

        /*
         * 密码标签
         * */
        //设置密码标签位置大小
        passwordLabel.setBounds(50, 130, 50, 50);
        //设置密码标签的字体样式
        passwordLabel.setFont(FONT);
        //添加密码标签
        add(passwordLabel);

        /*
         * 验证码标签
         * */
        //设置验证码标签位置大小
        codeLabel.setBounds(38, 210, 80, 50);
        //设置验证码标签字体样式
        codeLabel.setFont(FONT);
        //添加验证码标签
        add(codeLabel);

        /*
         * 显示验证码
         * */
        showCodeLabel = new JLabel(gameController.yzm());
        //设置验证码标签位置大小
        showCodeLabel.setBounds(210, 210, 100, 50);
        //设置验证码标签字体样式
        showCodeLabel.setFont(new Font("微软雅黑", Font.BOLD, 25));
        //添加验证码标签
        add(showCodeLabel);
        //创建验证码鼠标监听
        CodeMouseLis codeMouseLis=new CodeMouseLis(gameController);
        showCodeLabel.addMouseListener(codeMouseLis);


        /*
         * 账号文本框
         * */
        accountTextField.setBounds(100, 50, 200, 40);
        accountTextField.setFont(FONT);
        add(accountTextField);

        /*
         * 密码框
         * */
        passwordTextField.setBounds(100, 130, 200, 40);
        passwordTextField.setFont(FONT);
        add(passwordTextField);

        /*
         * 验证码文本框
         * */
        codeTextField.setBounds(100, 210, 100, 40);
        codeTextField.setFont(FONT);
        add(codeTextField);


        /*
         * 登录按钮
         * */
        loginBtn.setBounds(70, 300, 100, 40);
        loginBtn.setFont(FONT);

//        //创建鼠标监听器
//        LoginMouseLis loginMouseLis = new LoginMouseLis(gameController);
//        loginBtn.addMouseListener(loginMouseLis);

        add(loginBtn);

        /*
         * 注册按钮
         * */
        enrollBtn.setBounds(250, 300, 100, 40);
        enrollBtn.setFont(FONT);
        add(enrollBtn);

        //实例化动作监听
        LoginActionLis loginActionLis = new LoginActionLis();
        //添加登录按钮动作监听
        loginBtn.addActionListener(loginActionLis);
        loginBtn.setActionCommand("loginBtn");
        //添加注册按钮动作监听
        enrollBtn.addActionListener(loginActionLis);
        enrollBtn.setActionCommand("enrollBtn");
    }

    /**
     * @description: 绘制图片
     * @Param g:
     * @return: void
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image image = new ImageIcon("HitMouse/src/imagesM/bk2.jpg").getImage();
        g.drawImage(image, 0, 0, 435, 392, null);

    }


    public JLabel getAccountLabel() {
        return accountLabel;
    }

    public void setAccountLabel(JLabel accountLabel) {
        this.accountLabel = accountLabel;
    }

    public JLabel getPasswordLabel() {
        return passwordLabel;
    }

    public void setPasswordLabel(JLabel passwordLabel) {
        this.passwordLabel = passwordLabel;
    }

    public JLabel getCodeLabel() {
        return codeLabel;
    }

    public void setCodeLabel(JLabel codeLabel) {
        this.codeLabel = codeLabel;
    }

    public JLabel getShowCodeLabel() {
        return showCodeLabel;
    }

    public void setShowCodeLabel(JLabel showCodeLabel) {
        this.showCodeLabel = showCodeLabel;
    }

    public JTextField getAccountTextField() {
        return accountTextField;
    }

    public void setAccountTextField(JTextField accountTextField) {
        this.accountTextField = accountTextField;
    }

    public JPasswordField getPasswordTextField() {
        return passwordTextField;
    }

    public void setPasswordTextField(JPasswordField passwordTextField) {
        this.passwordTextField = passwordTextField;
    }

    public JTextField getCodeTextField() {
        return codeTextField;
    }

    public void setCodeTextField(JTextField codeTextField) {
        this.codeTextField = codeTextField;
    }

    public JButton getLoginBtn() {
        return loginBtn;
    }

    public void setLoginBtn(JButton loginBtn) {
        this.loginBtn = loginBtn;
    }

    public JButton getEnrollBtn() {
        return enrollBtn;
    }

    public void setEnrollBtn(JButton enrollBtn) {
        this.enrollBtn = enrollBtn;
    }


}
