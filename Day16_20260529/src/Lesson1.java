import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Lesson1 {
    public static void main(String[] args) throws Exception {
        //2.加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        //3.连接数据库
        Connection conn=DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/oto2603",
                "root",
                "0517"
        );

        //5.编写SQL语句
        String sql="select * from user where account=? and password=?";

        //4.建立执行者对象
        PreparedStatement ps=conn.prepareStatement(sql);
        ps.setString(1,"zhangsan");
        ps.setString(2,"123123");

        //6.执行sql语句，并返回结果
        ResultSet rs=ps.executeQuery();

        if(rs.next()){
            System.out.println("查询成功");
            System.out.println(rs.getString("id"));
        }else{
            System.out.println("查询失败");
        }

        //7.关闭资源
        rs.close();
        ps.close();
        conn.close();
    }
}
