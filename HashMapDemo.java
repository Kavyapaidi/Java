import java.util.*;
public class HashMapDemo {
    public static void main(String[] args) {
        //can use HashTable also
        Map<String,Integer> map=new HashMap<>();
        map.put("Kavya",100);
        map.put("Lavs",90);
        map.put("Gops",80);
        map.put("Kusuma",99);
        System.out.println(map);
        //random order
        for(String key:map.keySet())
        {
            System.out.println(key+":"+map.get(key));
        }
    }
}
