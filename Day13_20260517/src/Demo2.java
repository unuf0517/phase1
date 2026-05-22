import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        //泛型：在创建集合对象时，指定集合中元素的类型
        //好处：1.提高安全性，避免了存储错误数据 2.避免了强转的麻烦
        ArrayList<String> list=new ArrayList<String>();
        list.add("123");
        list.add("abc");
        //list.add(456);//编译报错，类型不匹配
        System.out.println(list);
    }
}
