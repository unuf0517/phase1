import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {
    public static void main(String[] args) {
        //空参构造
        ArrayList list=new ArrayList();

        //添加
        list.add("123");
        list.add(456);
        list.add('a');
        list.add(3.14);
        System.out.println(list);
        list.add(1,"abc");//在指定位置添加数据
        System.out.println("添加:"+list);

        //修改
        list.set(2,'b');
        System.out.println("修改:"+list);

        //删除
        list.remove(3);
        System.out.println("删除:"+list);

        //获取
        System.out.println("获取:"+list.get(2));
        System.out.println("-----------------------------");

        //遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("-----------------------------");
        //增强for循环，不拘泥于索引，直接获取元素
        for(Object obj:list){
            System.out.println(obj);
        }

        System.out.println("-----------------------------");
        //迭代器遍历(只适用于集合)
        Iterator it=list.iterator();
        while(it.hasNext()){//检查迭代器是否有下一个元素
            System.out.println(it.next());//返回迭代器的下一个元素，并且迭代器向后移动一位
        }
    }
}
