import java.util.HashSet;
import java.util.Iterator;

public class Demo3 {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();

        //添加
        hs.add("a");
        hs.add("b");
        hs.add("c");
        hs.add("a");//重复元素，添加失败
        hs.add("1");
        hs.add("2");
        hs.add("3");
        System.out.println(hs);//无序，不重复

        //删除
        hs.remove("1");
        System.out.println("删除:"+hs);

        Iterator<String> it=hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
