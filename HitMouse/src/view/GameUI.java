package view;

import controller.GameController;
import view.enroll.EnrollFrame;
import view.game.GameFrame;
import view.login.LoginFrame;

public class GameUI {
    //登录窗口
    public static LoginFrame loginFrame;
    //注册窗口
    public static EnrollFrame enrollFrame;
    //游戏窗口
    public static GameFrame gameFrame;

    public GameUI(GameController gameController){
        loginFrame=new LoginFrame(gameController);
        enrollFrame=new EnrollFrame();
        gameFrame=new GameFrame();
    }

}
