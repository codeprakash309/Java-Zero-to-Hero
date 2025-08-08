//different ways to remove elements
import java.util.HashMap;

public class HashMapExample4 {
    public static void main(String[] args) {
        HashMap<Integer,String>hMap=new HashMap<Integer,String>();
        hMap.put(100,"AlluArjun");
        hMap.put(101,"sanjaydat");
        hMap.put(102,"rohit");
        hMap.put(103,"salman");
        System.out.println("initial list elements: "+hMap);
        //key-based removal
        hMap.remove(101);
        System.out.println("Update list elements : "+hMap);
        //value-based removal
        hMap.remove(103, "salman");
        System.out.println("Update list elements : "+hMap);
    }
}
