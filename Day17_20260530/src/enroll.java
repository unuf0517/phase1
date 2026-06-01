import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class enroll {
    public static void main(String[] args) throws Exception {
    int n=enroll("1","1","1");
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
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn= DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/oto2603",
                "root",
                "0517");
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
