import java.io.FileReader;
import java.io.FileWriter;

public class Lesson05 {
    public static void main(String[] args) throws Exception {
        FileReader fr=new FileReader("E:\\class\\code\\Day18_20260605\\text.txt");
        System.out.println((char)fr.read());

        char[] chars=new char[4];
        int len=fr.read(chars);
        System.out.println(new String(chars, 0, len));

        FileWriter fw=new FileWriter("E:\\class\\code\\Day18_20260605\\output.txt");
        fw.write('A');
        char[] chars2={'B', 'C', 'D', 'E'};
        fw.write(chars2);
        fw.flush();//刷新流，强制将缓冲区中的数据写入文件
        fw.close();
    }
}
