import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListItreratorRemoveExample {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<Integer>();
        numbers.add(13);
        numbers.add(18);
        numbers.add(25);
        numbers.add(40);
        Iterator<Integer> numbersIterator=numbers.iterator();
        while (numbersIterator.hasNext()) {
            Integer num=numbersIterator.next();
            if(num%2!=0){
                numbersIterator.remove();
            }
        }
        System.out.println(numbers);
    }
}
