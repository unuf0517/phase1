import java.sql.*;

public class Login {
    public static void main(String[] args) throws Exception {

        String acc = "xiaoli";
        String pwd = "111111";

        UserDO userDO = login(acc, pwd);

        if (userDO != null) {
            System.out.println("欢迎管理员: " + userDO.getName());
        } else {
            System.out.println("登录失败");
        }


    }


    /**
     * @Description: 登录
     * @Param: [acc, password]
     * @return: void
     */
    public static UserDO login(String acc, String pwd) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            //2.加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            //3.建立连接
            // jdbc:mysql://ip:端口/数据库名称
            conn = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/oto2603",
                    "root",
                    "root");

            //5.写sql
            String sql = "select * from user where account = ? and password = ?";

            //4.创建执行者对象
            ps = conn.prepareStatement(sql);
            ps.setString(1, acc);
            ps.setString(2, pwd);

            //6.执行sql ，并处理返回结果
            rs = ps.executeQuery();

            if (rs.next()) {
                return new UserDO(rs.getString("name"), rs.getString("gender"), rs.getString("create_time"));
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
