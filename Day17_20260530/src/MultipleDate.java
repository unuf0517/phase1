import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MultipleDate {
    public static void main(String[] args) throws Exception {
        List<UserDO> list=test();
        for(UserDO user:list){
            System.out.println(user);
        }
    }
    public static List<UserDO> test() throws Exception {
        List<UserDO> list=new ArrayList<>();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/oto2603","root","0517");
        String sql="select * from user";
        PreparedStatement ps=conn.prepareStatement(sql);
        ResultSet rs=ps.executeQuery();
        while (rs.next()) {
            UserDO user = new UserDO();
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));
            user.setAccount(rs.getString("account"));
            user.setPassword(rs.getString("password"));
            user.setAge(rs.getInt("age"));
            user.setCreateTime(rs.getString("create_time"));
            user.setStatus(rs.getString("status"));
            list.add(user);
        }
        rs.close();
        ps.close();
        conn.close();
        return list;
    }
}
