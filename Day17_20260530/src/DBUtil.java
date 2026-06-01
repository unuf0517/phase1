import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DBUtil {
    public static String driver;
    public static String url;
    public static String root;
    public static String pwd;

    static{
        try{
            //实例化properties对象
            Properties prop=new Properties();

            //2.读取数据库的配置文件
            //路径注意事项: 如果是有单个项目 config\db.properties
            //             如果是在模块底下  加上模块名
            prop.load(new FileInputStream("Day17_20260530/config/db.properties"));

            driver=prop.getProperty("driver");
            url=prop.getProperty("url");
            root=prop.getProperty("root");
            pwd=prop.getProperty("pwd");

        }catch(IOException e){
            throw new RuntimeException(e);
        }

    }
}