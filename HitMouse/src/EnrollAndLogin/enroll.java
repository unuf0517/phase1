package EnrollAndLogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import static controller.DBUtil.driver;
import static controller.DBUtil.pwd;
import static controller.DBUtil.root;
import static controller.DBUtil.url;

public class enroll {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String name = sc.next();
        String account = sc.next();
        String password = sc.next();
        int n=enroll(name, account, password);
        System.out.println(n);
    }

    /**
     * 用户注册
     * @param na 用户名
     * @param ac 账号
     * @param pw 密码
     * @throws Exception
     * @return int 1-用户已存在.2-注册成功.3-注册失败
     */
    public static int enroll(String na,String ac,String pw) throws Exception {
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(
                url,
                root,
                pwd);
        String sql="select * from user where account=?";
        PreparedStatement ps=conn.prepareStatement(sql);
        ps.setString(1,ac);
        ResultSet rs=ps.executeQuery();
        if (rs.next()) {
            return 1;
        }
        String sqlen="insert into user(name,account,password) values(?,?,?)";
        ps=conn.prepareStatement(sqlen);
        ps.setString(1,na);
        ps.setString(2,ac);
        ps.setString(3,pw);
        int a=ps.executeUpdate();
        return a>0? 2:3;

    }
}
