import java.util.HashSet;

//given an element write a program check if element exist in HashSet
public class HashSetContainsExample {
    public static void main(String[] args) {
        //initialize HashSet
        HashSet<Integer>hSet=new HashSet<Integer>();
        hSet.add(10);
        hSet.add(11);
        hSet.add(12);
        hSet.add(13);
        hSet.add(14);
        //check if HashSet contains element
        if(hSet.contains(12))
        {
            System.out.println("12 was found in the list");
        }else{
            System.out.println("12 was not found in the list");
        }
    }
}
