import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Lesson2 {
    public static void main(String[] args) throws Exception {
        //2.加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        //3.连接数据库
        Connection conn= DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/oto2603",
                "root",
                "0517"
        );

        //5.编写SQL语句
        String sql="update user set password=? where id=?;\n";//修改

        //4.建立执行者对象
        PreparedStatement ps=conn.prepareStatement(sql);
        ps.setString(1,"123123");
        ps.setInt(2,1);

        //6.执行sql语句，并返回结果
        int res=ps.executeUpdate();
        if(res>0){
            System.out.println("更新成功");
        }else{
            System.out.println("更新失败");
        }

        //7.关闭资源
        ps.close();
        conn.close();
    }
}
