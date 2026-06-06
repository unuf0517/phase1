import java.io.FileInputStream;

public class Lesson2 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis=new FileInputStream("E:/class/code/Day18_20260605/text.txt");

        int len;
        while((len=fis.read())!=-1){
            System.out.println((char)len);
        }

        fis.close();
        System.out.println("================================");

        FileInputStream fis2=new FileInputStream("E:/class/code/Day18_20260605/text.txt");

        byte[] bytes=new byte[2];
        int len2;
        while((len2=fis2.read(bytes))!=-1){
            String s=new String(bytes,0,len2);
            System.out.println(s);
        }

    }
}
