import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Lesson3 {
    public static void main(String[] args) throws Exception {
        //2.加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        //3.连接数据库
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/oto2603",
                "root",
                "0517"
        );

        //5.编写SQL语句
        String sql = "insert into user (account,password,gender) values(?,?,?)";//注册

        //4.建立执行者对象
        PreparedStatement rps = conn.prepareStatement(sql);
        rps.setString(1, "lisi");
        rps.setString(2, "456456");
        rps.setInt(3, 1);

        //6.执行sql语句，并返回结果
        int res = rps.executeUpdate();
        if (res > 0) {
            System.out.println("插入成功");
        } else {
            System.out.println("插入失败");
        }

        //7.关闭资源
        rps.close();
        conn.close();
    }
}
