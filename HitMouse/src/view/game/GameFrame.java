package view.game;


import controller.action.MenuActionLis;
import controller.win.WindowLis;

import javax.swing.*;
import java.awt.*;

/**
 * @BelongsProject: HitMouse
 * @BelongsPackage: org.wql.view.game
 * @Author: 阿隆
 * @CreateTime: 2024-04-18  11:26
 * @Description: 游戏窗口
 * @Version: 1.0
 */
public class GameFrame extends JFrame {
    //字体样式
    private final Font FONT = new Font("微软雅黑", Font.BOLD, 15);
    //中心面板
    private GameCenterPanel gameCenterPanel;
    //信息面板
    private GameInformationPanel gameInformationPanel;
    //开始游戏菜单子项
    private JMenuItem startItem;
    //暂停游戏菜单子项
    private JMenuItem stopItem;
    //重新开始菜单子项
    private JMenuItem restartItem;


    /**
     * @description: 空参构造
     * @return: null
     */
    public GameFrame() {
        //初始化页面
        initFrame();
        //初始化菜单
        initMenu();

        //实例化窗口监听
        WindowLis windowLis = new WindowLis();
        //窗口添加监听
        addWindowListener(windowLis);

        //页面可视化
        setVisible(false);
    }


    /**
     * @description: 初始化菜单
     * @return: void
     */
    private void initMenu() {
        //创建菜单栏对象
        JMenuBar menuBar = new JMenuBar();
        //创建菜单对象
        JMenu operationMenu = new JMenu("操作");
        JMenu aboutMenu = new JMenu("关于");
        //创建菜单子项
        startItem = new JMenuItem("开始游戏");
        stopItem = new JMenuItem("暂停游戏");
        restartItem = new JMenuItem("重新开始");
        JMenuItem exitItem = new JMenuItem("退出登录");
        JMenuItem writerItem = new JMenuItem("关于作者");
        JMenuItem aboutGameItem = new JMenuItem("关于游戏");

        //实例化动作监听
        MenuActionLis menuActionLis = new MenuActionLis();
        //菜单设置动作指令
        startItem.setActionCommand("start");
        stopItem.setActionCommand("stop");
        restartItem.setActionCommand("restart");
        exitItem.setActionCommand("exit");
        writerItem.setActionCommand("writer");
        aboutGameItem.setActionCommand("aboutGame");
        //菜单子项添加动作监听
        startItem.addActionListener(menuActionLis);
        stopItem.addActionListener(menuActionLis);
        restartItem.addActionListener(menuActionLis);
        exitItem.addActionListener(menuActionLis);
        writerItem.addActionListener(menuActionLis);
        aboutGameItem.addActionListener(menuActionLis);

        //菜单添加菜单项
        operationMenu.add(startItem);
        operationMenu.add(stopItem);
        operationMenu.add(restartItem);
        operationMenu.add(exitItem);
        aboutMenu.add(writerItem);
        aboutMenu.add(aboutGameItem);
        //菜单栏添加菜单
        menuBar.add(operationMenu);
        menuBar.add(aboutMenu);
        //窗口设置菜单栏
        setJMenuBar(menuBar);

    }

    /**
     * @description: 初始化页面
     * @return: void
     */
    private void initFrame() {
        //设置为边界布局
        setLayout(new BorderLayout());
        //设置标题
        setTitle("阿隆版打地鼠");
        //设置窗口大小
        setSize(680, 500);
        //设置窗口固定大小
        setResizable(false);
        //设置窗口居中
        setLocationRelativeTo(null);
        //设置窗口关闭操作
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        //创建中心面板实例
        gameCenterPanel = new GameCenterPanel();
        //添加中心面板
        add(gameCenterPanel, BorderLayout.CENTER);
        //创建信息面板实例
        gameInformationPanel = new GameInformationPanel();
        //添加信息面板
        add(gameInformationPanel, BorderLayout.EAST);
    }



    public GameCenterPanel getGameCenterPanel() {
        return gameCenterPanel;
    }
    public GameInformationPanel getGameInformationPanel() {
        return gameInformationPanel;
    }

}
