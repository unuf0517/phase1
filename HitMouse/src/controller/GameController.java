package controller;

import model.Palyer.HitmouseDO;
import view.GameUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

import static controller.DBUtil.driver;
import static controller.DBUtil.pwd;
import static controller.DBUtil.root;
import static controller.DBUtil.url;

public class GameController {
    private final static GameController gameController = new GameController();
    private Mouse mouse;
    private Player player;
    private GameMap gameMap;
    private GameTimer gameTimer;

    private GameController(){
        mouse = new Mouse();
        player = new Player();
        gameMap = new GameMap();
        gameTimer = new GameTimer();
        new GameUI(this);
        gameTimer.getTimer().start();
    }

    public static GameController getInstance() {
        return gameController;
    }

    public static HitmouseDO login(String acc, String pw) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(
                    url,
                    root,
                    pwd);

            String sql = "select * from hitmouse where account = ? and password = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, acc);
            ps.setString(2, pw);
            rs = ps.executeQuery();

            if (rs.next()) {
                return new HitmouseDO(rs.getLong("id"), rs.getString("name"), rs.getString("account"), rs.getString("password"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //7.释放资源  自下而上
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }


        }


        return null;

    }

    public String yzm(){
        String s="123456789qwertyuioplkjhgfdsazxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM";
        Random r=new Random();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<4;i++){
            sb.append(s.charAt(r.nextInt(s.length())));
        }
        return sb.toString();
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public GameMap getGameMap() {
        return gameMap;
    }

    public void setGameMap(GameMap gameMap) {
        this.gameMap = gameMap;
    }
}
