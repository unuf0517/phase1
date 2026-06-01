import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DBUtil {
    public static String driver;
    public static String url;
    public static String user;
    public static String password;


    //静态代码块
    static {

        try {
            //1.实例化Properties
            Properties prop = new Properties();


            //2.读取数据库的配置文件
            //路径注意事项: 如果是有单个项目 config\db.properties
            //             如果是在模块底下  加上模块名
            prop.load(new FileInputStream("20260530\\config\\db.properties"));

            //3.根据key获取values
            driver = prop.getProperty("driver");
            url = prop.getProperty("url");
            user = prop.getProperty("user");
            password = prop.getProperty("password");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }



}