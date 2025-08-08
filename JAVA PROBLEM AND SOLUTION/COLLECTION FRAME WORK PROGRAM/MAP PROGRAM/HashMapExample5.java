//different ways to remove elements
import java.util.HashMap;
import java.util.*;;
public class HashMapExample5 {
    public static void main(String[] args) {
        HashMap<Integer,String>hMap=new HashMap<Integer,String>();
        hMap.put(100,"AlluArjun");
        hMap.put(101,"sanjaydat");
        hMap.put(102,"rohit");
        hMap.put(103,"salman");
        System.out.println("initioal list elements : ");
        for (Map.Entry m:hMap.entrySet()) {
            System.out.println(m.getKey()+" = "+m.getValue());
        }
        System.out.println("üpdate list of elemets");
        hMap.replace(101, "ramcharan");
        for (Map.Entry m : hMap.entrySet()) {
            System.out.println(m.getKey()+" = "+m.getValue());
        }


        System.out.println("üpdate list of elemets");
        hMap.replace(103, "salman", "MaheshBabu");
        for (Map.Entry m : hMap.entrySet()) {
            System.out.println(m.getKey()+" = "+m.getValue());
            }

        System.out.println("üpdate list of elemets");
        hMap.replaceAll((k,v)->"LOL");
        for (Map.Entry m : hMap.entrySet()) {
            System.out.println(m.getKey()+" = "+m.getValue());
        }
    }
}
