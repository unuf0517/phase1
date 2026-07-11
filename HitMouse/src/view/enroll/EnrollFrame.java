package view.enroll;



import javax.swing.*;

/**
 * @BelongsProject: HitMouse
 * @BelongsPackage: org.wql.view.enroll
 * @Author: 阿隆
 * @CreateTime: 2024-04-19  16:21
 * @Description: 注册窗口
 * @Version: 1.0
 */
public class EnrollFrame extends JFrame {
    //注册面板
    private EnrollPanel enrollPanel;


    /**
     * @description: 构造方法
     * @return: null
     */
    public EnrollFrame() {

        //初始化页面
        initFrame();

        //页面可视化
        setVisible(false);
    }


    /**
     * @description: 初始化页面
     * @return: void
     */
    private void initFrame() {
        //设置窗口大小
        setSize(450, 430);
        //设置标题
        setTitle("注册页面");
        //固定窗口大小
        setResizable(false);
        //窗口居中
        setLocationRelativeTo(null);
        //设置窗口关闭操作
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        /*
         * DO_NOTHING_ON_CLOSE   点击关闭时不做任何操作
         * HIDE_ON_CLOSE         点击关闭时隐藏窗口  (默认)
         * EXIT_ON_CLOSE         点击关闭时关闭窗口
         * DISPOSE_ON_CLOSE      点击关闭时隐藏窗口  释放窗口占用的资源
         *
         * */
        enrollPanel = new EnrollPanel();

        //添加面板
        add(enrollPanel);
    }

    public EnrollPanel getEnrollPanel() {
        return enrollPanel;
    }


}
