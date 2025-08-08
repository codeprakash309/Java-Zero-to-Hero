//different way to insert elements
import java.util.*;
public class HashMapExample3 {
    public static void main(String[] args) {
        HashMap<Integer,String> hMap=new HashMap<Integer,String>();
        System.out.println("initial list of elements : "+hMap);
        hMap.put(100,"Amiit");
        hMap.put(102,"sanjay");
        hMap.put(103,"gopal");
        hMap.put(104,"allu");
        System.out.println("After invoking put() method");
        for (Map.Entry m : hMap.entrySet()) {
            System.out.println(m.getKey()+" = "+m.getValue());
        }

        hMap.putIfAbsent(105,"gourav");
        System.out.println("After invoking putIfAbsent() method");
        for (Map.Entry m :hMap.entrySet()) {
            System.out.println(m.getKey()+" = "+m.getValue());
            
        }
        HashMap<Integer,String> hMap2=new HashMap<Integer,String>();
        hMap2.put(104,"Chandan");
        hMap2.putAll(hMap);
        System.out.println("After invoking putAll() method");
        for (Map.Entry m : hMap2.entrySet()) {
            System.out.println(m.getKey()+" = "+m.getValue());
        }
    }
}
