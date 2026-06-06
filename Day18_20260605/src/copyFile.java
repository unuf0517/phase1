import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class copyFile {
    public static void main(String[] args) throws Exception {
        //路径不包含文件夹
        String s="E:/class/code/Day18_20260605/text.txt";
        if(copyFile(s))
            System.out.println("文件拷贝成功");
        else
            System.out.println("文件拷贝失败");
    }

    /**
     * 拷贝文件
     * @param s 待拷贝文件的路径
     * @return 拷贝成功返回true，失败返回false
     */
    public static boolean copyFile(String s) throws Exception {
        File file=new File(s);
        if(!file.exists() || !file.isFile()){
            return false;
        }
        String name=file.getName();
        String[] sp=name.split("\\.");
        FileInputStream fis=new FileInputStream(file);
        FileOutputStream fos=new FileOutputStream(sp[0]+"_copy."+sp[1]);

        byte[] bytes=new byte[512];
        int len;
        while((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fis.close();
        fos.close();

        return true;
    }

}
