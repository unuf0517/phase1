package view.game;


import javax.swing.*;
import java.awt.*;

/**
 * @BelongsProject: HitMouse
 * @BelongsPackage: org.wql.view.game
 * @Author: 阿隆
 * @CreateTime: 2024-04-19  16:03
 * @Description: 游戏信息面板
 * @Version: 1.0
 */
public class GameInformationPanel extends JPanel {
    //定义不变的JLabel
    private final JLabel WELCOME_LABEL = new JLabel("欢迎玩家：");
    private final JLabel APPEAR_LABEL = new JLabel("地鼠出现次数为：");
    private final JLabel SURPLUS_LABEL = new JLabel("游戏倒计时：");
    private final JLabel HIT_LABEL = new JLabel("目前击中次数：");
    private final JLabel SCORE_LABEL = new JLabel("当前得分为：");
    private final JLabel HINT_LABEL = new JLabel("<html><body>【温馨提示】：游戏时间为60秒，在游戏时间内总击中次数大于等于10次，即为获胜！！<body></html>");
    private final Font FONT = new Font("微软雅黑", Font.BOLD, 15);
    //昵称
    private JLabel nicknameLabel = new JLabel();
    //出现次数
    private JLabel appearNumberLabel = new JLabel("【0】次");
    //倒计时
    private JLabel timeLabel = new JLabel("【60】秒");
    //打中次数
    private JLabel hitNumberLabel = new JLabel("【0】次");
    //玩家得分
    private JLabel scoreLabel = new JLabel("【0】分");


    /**
     * @description: 构造方法
     * @return: null
     */
    public GameInformationPanel() {

        //设置背景图片
        setBackground(Color.CYAN);
        //设置为自由布局
        setLayout(null);
        //设置面板首选大小
        setPreferredSize(new Dimension(220, 500));
        //设置固定JLabel位置
        WELCOME_LABEL.setBounds(10, 10, 180, 30);
        WELCOME_LABEL.setFont(FONT);
        HINT_LABEL.setBounds(10, 55, 180, 100);
        HINT_LABEL.setFont(FONT);
        SURPLUS_LABEL.setBounds(10, 165, 180, 30);
        SURPLUS_LABEL.setFont(FONT);
        APPEAR_LABEL.setBounds(10, 220, 180, 30);
        APPEAR_LABEL.setFont(FONT);
        HIT_LABEL.setBounds(10, 280, 180, 30);
        HIT_LABEL.setFont(FONT);
        SCORE_LABEL.setBounds(10, 340, 180, 30);
        SCORE_LABEL.setFont(FONT);

        nicknameLabel.setBounds(90, 10, 180, 30);
        nicknameLabel.setFont(FONT);
        appearNumberLabel.setBounds(130, 220, 100, 30);
        appearNumberLabel.setFont(FONT);
        hitNumberLabel.setBounds(120, 280, 180, 30);
        hitNumberLabel.setFont(FONT);
        timeLabel.setBounds(100, 165, 180, 30);
        timeLabel.setFont(FONT);
        scoreLabel.setBounds(100, 340, 180, 30);
        scoreLabel.setFont(FONT);


        //添加到面板
        add(WELCOME_LABEL);
        add(HINT_LABEL);
        add(SURPLUS_LABEL);
        add(APPEAR_LABEL);
        add(HIT_LABEL);
        add(SCORE_LABEL);
        add(appearNumberLabel);
        add(hitNumberLabel);
        add(timeLabel);
        add(scoreLabel);
        add(nicknameLabel);

    }


    /**
     * @description: getter and setter
     * @return: javax.swing.JLabel
     */
    public JLabel getAppearNumberLabel() {
        return appearNumberLabel;
    }

    public JLabel getTimeLabel() {
        return timeLabel;
    }

    public JLabel getHitNumberLabel() {
        return hitNumberLabel;
    }

    public JLabel getScoreLabel() {
        return scoreLabel;
    }

    public JLabel getNicknameLabel() {
        return nicknameLabel;
    }

}
