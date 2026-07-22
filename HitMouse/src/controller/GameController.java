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
    private int mouseNumber;
    private int gameTime=60;
    private int score;
    private int hitNumber;


    private GameController(){
        mouse = new Mouse();
        player = new Player();
        gameMap = new GameMap();
        gameTimer = new GameTimer();
        new GameUI(this);
        //gameTimer.getTimer().start();
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

    /**
     * @description: 注册方法
     * @param na 昵称
     * @param ac 账号
     * @param pw 密码
     * @return: int 1表示账号已存在，2表示注册成功，3表示注册失败
     */
    public static int enroll(String na,String ac,String pw){
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(
                    url,
                    root,
                    pwd);
            String sql="select * from hitmouse where account=?";
            ps=conn.prepareStatement(sql);
            ps.setString(1,ac);
            rs=ps.executeQuery();
            if (rs.next()) {
                return 1;
            }
            String sqlen="insert into hitmouse(name,account,password) values(?,?,?)";
            ps=conn.prepareStatement(sqlen);
            ps.setString(1,na);
            ps.setString(2,ac);
            ps.setString(3,pw);
            int a=ps.executeUpdate();
            return a>0? 2:3;
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
        return 3;
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

    public int getMouseNumber() {
        return mouseNumber;
    }

    public void setMouseNumber(int mouseNumber) {
        this.mouseNumber = mouseNumber;
    }

    public int getGameTime() {
        return gameTime;
    }

    public void setGameTime(int gameTime) {
        this.gameTime = gameTime;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getHitNumber() {
        return hitNumber;
    }

    public void setHitNumber(int hitNumber) {
        this.hitNumber = hitNumber;
    }

    public GameTimer getGameTimer() {
        return gameTimer;
    }

    public void setGameTimer(GameTimer gameTimer) {
        this.gameTimer = gameTimer;
    }
}
