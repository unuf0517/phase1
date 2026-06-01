import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        System.out.println(map.get("a"));
        System.out.println(map.keySet());
        map.remove("b");
        System.out.println(map.keySet());
        System.out.println(map);
        System.out.println("================================");

        Set<String> keySet=map.keySet();
        Iterator<String> it=keySet.iterator();
        while(it.hasNext()){
            String key=it.next();
            System.out.println("key: " + key);
            System.out.println("map: "+map.get(key));
        }
        System.out.println("================================");
        
        Set<Map.Entry<String, Integer>> entrySet=map.entrySet();
        Iterator<Map.Entry<String, Integer>> it2=entrySet.iterator();
        while(it2.hasNext()) {
            Map.Entry<String, Integer> entry = it2.next();
            System.out.println("key: " + entry.getKey());
            System.out.println("value: " + entry.getValue());
        }
    }
}
