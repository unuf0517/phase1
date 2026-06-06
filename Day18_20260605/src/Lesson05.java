import java.io.FileReader;

public class Lesson05 {
    public static void main(String[] args) throws Exception {
        FileReader fr=new FileReader("E:\\class\\code\\Day18_20260605\\text.txt");
        System.out.println((char)fr.read());
    }
}
