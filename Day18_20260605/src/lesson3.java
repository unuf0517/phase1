import java.io.FileOutputStream;

public class lesson3 {
    public static void main(String[] args) throws Exception {
        //文件不存在会创建文件，存在会覆盖
        FileOutputStream fos=new FileOutputStream("E:/class/code/Day18_20260605/text.txt",true);

        //写入单个字节
        fos.write(97);
        fos.write(98);
        fos.close();

        byte[] bytes={99,100,101};
        FileOutputStream fos2=new FileOutputStream("E:/class/code/Day18_20260605/text.txt");
        fos2.write(bytes);
        fos2.close();


    }
}
