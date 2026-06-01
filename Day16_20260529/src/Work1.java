import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn= DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/oto2603",
                "root",
                "0517");
        Scanner sc=new Scanner(System.in);
        String account;
        while (true){
            System.out.println("请输入账号：");
            account=sc.nextLine();

            String sql="select * from user where account=?";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1,account);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                System.out.println("账号已存在，请重新输入");
                rs.close();
                ps.close();
            }else{
                rs.close();
                ps.close();
                break;
            }
        }
        String sqlin="insert into user (name,account,password) values(?,?,?)";
        PreparedStatement psi=conn.prepareStatement(sqlin);
        System.out.println("请输入用户名：");
        String name=sc.nextLine();
        System.out.println("请输入密码：");
        String password=sc.nextLine();

        psi.setString(1,name);
        psi.setString(2,account);
        psi.setString(3,password);
        if(psi.executeUpdate()>0){
            System.out.println("注册成功");
        }else{
            System.out.println("注册失败");
        }
        psi.close();
        conn.close();
    }
}
