import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class copyDirector {
    public static void main(String[] args) throws Exception {
        String sourceDir="E:\\class\\code\\Day18_20260605\\1";
        String targetPath="E:\\class\\code\\Day18_20260605";
        if(copy(sourceDir, targetPath)){
            System.out.println("拷贝成功");
        }else{
            System.out.println("拷贝失败");
        }
    }
    public static boolean copy(String sourceDir,String targetPath) throws Exception {
        File sourcedir=new File(sourceDir);
        File targetpath=new File(targetPath);
        if(!sourcedir.exists() || !targetpath.exists()){
            System.out.println("源文件或目标路径不存在");
            return false;
        }
        if(sourcedir.isFile()){
            copyFile(sourcedir, targetpath);
            return true;
        }
        String name=sourcedir.getName();
        //创建新总文件夹
        File newDir=new File(targetPath,name+"_copy");
        newDir.mkdirs();
        copyDirector(sourcedir, newDir);
        return true;
    }
    public static void copyDirector(File source,File targetPath) throws Exception {
        if(source.isFile()) {
            copyFile(source, targetPath);
            return;
        }
        File[] files=source.listFiles();
        for(File f:files){
            if(f.isFile()){
                copyFile(f, new File(targetPath,f.getName()));
            }else{
                File childTarget = new File(targetPath,f.getName());
                childTarget.mkdirs(); //创建子文件夹
                copyDirector(f,childTarget);
            }
        }
    }
    public static void copyFile(File sourceDir, File targetPath) throws Exception {
        FileInputStream fis=new FileInputStream(sourceDir);
        FileOutputStream fos=new FileOutputStream(targetPath);
        byte[] bytes=new byte[1024];
        int len;
        while((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fis.close();
        fos.close();
    }
}
