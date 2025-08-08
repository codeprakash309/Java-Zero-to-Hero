import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.swing.plaf.basic.BasicBorders.SplitPaneBorder;
import javax.swing.plaf.synth.SynthSplitPaneUI;

import java.util.HashMap;
public class HashMapExample1 {
    public static void main(String[] args) {
        //initialize HashMap
        HashMap<Integer,String> hMap=new HashMap<Integer,String>();
        hMap.put(1,"praksh");
        hMap.put(2,"prince");
        hMap.put(3, "guddu");
        hMap.put(4,"krishna");
        System.out.println("Iterating HashMap....");
        for ( Map.Entry m:hMap.entrySet()) {
            System.out.println(m.getKey()+" = "+m.getValue());
        }
        
    }
}
