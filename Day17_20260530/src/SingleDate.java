import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SingleDate {
    public static void main(String[] args) throws Exception{
        String account="zhangsan";
        String password="123132";
        UserDO user=login(account,password);
        if(user!=null){
            System.out.println("登录成功："+user);
        }else{
            System.out.println("登录失败");
        }

    }

    public static UserDO login(String account, String password) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/oto2603",
                "root",
                "0517");
        String sql="select * from user where account=? and password=?";
        PreparedStatement ps=conn.prepareStatement(sql);
        ps.setString(1,account);
        ps.setString(2,password);
        ResultSet rs=ps.executeQuery();
        if(rs.next()){
            return new UserDO(rs.getString("name"),rs.getString("gender"),rs.getString("create_time"));
        }
        rs.close();
        ps.close();
        conn.close();
        return null;
    }
}
