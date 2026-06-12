package HitMouse.EnrollAndLogin;

import HitMouse.Palyer.HitmouseDO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import static HitMouse.DBUtil.driver;
import static HitMouse.DBUtil.pwd;
import static HitMouse.DBUtil.root;
import static HitMouse.DBUtil.url;

public class Login {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String acc = sc.next();
        String pwd = sc.next();

        HitmouseDO hitmouseDO = login(acc, pwd);

        if (hitmouseDO != null) {
            System.out.println("欢迎管理员: " + hitmouseDO.getName());
        } else {
            System.out.println("登录失败");
        }


    }

    /**
     * @Description: 登录
     * @Param: [acc, password]
     * @return: void
     */
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

            String sql = "select * from user where account = ? and password = ?";
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
}
