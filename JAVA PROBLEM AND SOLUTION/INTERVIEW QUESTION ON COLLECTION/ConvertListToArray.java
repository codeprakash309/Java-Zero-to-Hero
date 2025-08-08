import java.util.ArrayList;

public class ConvertListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(10);
        al.add(5);
        al.add(8);
        al.add(6);
        int[] arr=al.toArray(new Integer[al.size()]);
    }
}
