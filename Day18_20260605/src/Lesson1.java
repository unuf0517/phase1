import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class Lesson1 {
    public static void main(String[] args) throws Exception {
        File file=new File("E:/class/code/Day18_20260605/text.txt");

        if(!file.exists()){
            file.createNewFile();//#如果不存在就创建文件
        }

        System.out.println("目录是否存在: " + file.exists());
        System.out.println("判断是否为目录: " + file.isDirectory());
        System.out.println("判断是否为文件: " + file.isFile());

        String name=file.getName();
        String[] sp=name.split("\\.");
        String newName= UUID.randomUUID().toString().replace("-","")+"."+sp[1];
        System.out.println("新文件名: " + newName);
    }
}
