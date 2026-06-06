import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Lesson4 {
    public static void main(String[] args) throws Exception {
        //拷贝文件 1、重复读 2、怎么读怎么写

        //读
        FileInputStream fis=new FileInputStream("E:/class/code/Day18_20260605/text.txt");

        //写
        FileOutputStream fos = new FileOutputStream("E:/class/code/Day18_20260605/text_copy.txt");

        byte[] bytes=new byte[5];

        int len;
        while((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fis.close();
        fos.close();
    }
}
