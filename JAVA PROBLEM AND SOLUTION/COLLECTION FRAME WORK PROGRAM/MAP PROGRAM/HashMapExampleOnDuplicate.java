import java.util.HashMap;
import java.util.Map;

public class HashMapExampleOnDuplicate {
    public static void main(String[] args) {
        HashMap<Integer,String> hMap=new HashMap<Integer,String>();
        hMap.put(1,"banana");
        hMap.put(2,"apple");
        hMap.put(3,"orange");
        hMap.put(4,"mango");
        hMap.put(1,"grapes");
        System.out.println("HashMap keys and values are : ");
        for(Map.Entry m:hMap.entrySet())
        {
            System.out.println(m.getKey()+" = "+m.getValue());
        }
        System.out.println("after enterd duplicate key into Map : ");
        hMap.put(1,"grapes");
        for(Map.Entry m:hMap.entrySet())
        {
            System.out.println(m.getKey()+" = "+m.getValue());
        }
    }
}
