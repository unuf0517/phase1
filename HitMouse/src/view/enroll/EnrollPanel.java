package view.enroll;


import controller.action.EnrollActionLis;

import javax.swing.*;
import java.awt.*;

/**
 * @BelongsProject: HitMouse
 * @BelongsPackage: org.wql.view.enroll
 * @Author: 阿隆
 * @CreateTime: 2024-04-19  16:22
 * @Description: 注册面板
 * @Version: 1.0
 */
public class EnrollPanel extends JPanel {
    //字体样式
    private final Font FONT = new Font("微软雅黑", Font.BOLD, 16);
    //昵称标签
    private JLabel nicknameLabel = new JLabel("昵称:");
    //账号标签
    private JLabel accountLabel = new JLabel("账号:");
    //密码标签
    private JLabel passwordLabel = new JLabel("密码:");
    //确认密码标签
    private JLabel confirmPasswordLabel = new JLabel("确认密码:");
    //昵称文本框
    private JTextField nicknameTextField = new JTextField();
    //账号文本框
    private JTextField accountTextField = new JTextField();
    //密码框
    private JPasswordField passwordTextField = new JPasswordField();
    //确认密码文本框
    private JPasswordField confirmPasswordTextField = new JPasswordField();
    //注册按钮
    private JButton enrollBtn = new JButton("注册");
    //登录按钮
    private JButton loginBtn = new JButton("登录");



    /**
     * @description: 空参构造
     * @return: null
     */
    public EnrollPanel() {

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
         * 昵称标签
         * */
        nicknameLabel.setBounds(50, 20, 50, 50);
        nicknameLabel.setFont(FONT);
        add(nicknameLabel);
        /*
         * 账号标签
         * */
        //设置账号标签位置大小
        accountLabel.setBounds(50, 90, 50, 50);
        //设置账号标签的字体样式
        accountLabel.setFont(FONT);
        //添加账号标签
        add(accountLabel);

        /*
         * 密码标签
         * */
        //设置密码标签位置大小
        passwordLabel.setBounds(50, 160, 50, 50);
        //设置密码标签的字体样式
        passwordLabel.setFont(FONT);
        //添加密码标签
        add(passwordLabel);

        /*
         * 确认密码标签
         * */
        //设置确认密码标签位置大小
        confirmPasswordLabel.setBounds(20, 230, 80, 50);
        //设置确认密码标签字体样式
        confirmPasswordLabel.setFont(FONT);
        //添加确认密码标签签
        add(confirmPasswordLabel);


        /*
         * 昵称文本框
         * */
        nicknameTextField.setBounds(100, 20, 200, 40);
        nicknameTextField.setFont(FONT);
        add(nicknameTextField);

        /*
         * 账号文本框
         * */
        accountTextField.setBounds(100, 90, 200, 40);
        accountTextField.setFont(FONT);
        add(accountTextField);

        /*
         * 密码框
         * */
        passwordTextField.setBounds(100, 160, 200, 40);
        passwordTextField.setFont(FONT);
        add(passwordTextField);

        /*
         * 确认密码文本框
         * */
        confirmPasswordTextField.setBounds(100, 230, 200, 40);
        confirmPasswordTextField.setFont(FONT);
        add(confirmPasswordTextField);


        /*
         * 注册按钮
         * */
        enrollBtn.setBounds(70, 300, 100, 40);
        enrollBtn.setFont(FONT);
        add(enrollBtn);

        /*
         * 登录按钮
         * */
        loginBtn.setBounds(250, 300, 100, 40);
        loginBtn.setFont(FONT);
        add(loginBtn);

        //实例化动作监听
        EnrollActionLis enrollActionLis=new EnrollActionLis();
        //注册按钮添加动作监听
        enrollBtn.addActionListener(enrollActionLis);
        enrollBtn.setActionCommand("enrollBtn");
        //登录按钮添加动作监听
        loginBtn.addActionListener(enrollActionLis);
        loginBtn.setActionCommand("loginBtn");

    }

    public Font getFONT() {
        return FONT;
    }

    public JTextField getNicknameTextField() {
        return nicknameTextField;
    }

    public JTextField getAccountTextField() {
        return accountTextField;
    }

    public JPasswordField getPasswordTextField() {
        return passwordTextField;
    }

    public JPasswordField getConfirmPasswordTextField() {
        return confirmPasswordTextField;
    }

    /**
     * @description: 绘制图片
     * @Param g:
     * @return: void
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //获取图像
        Image image = new ImageIcon("HitMouse/src/imagesM/bk2.jpg").getImage();
        //绘制图像
        g.drawImage(image, 0, 0, 435, 392, null);

    }
}
