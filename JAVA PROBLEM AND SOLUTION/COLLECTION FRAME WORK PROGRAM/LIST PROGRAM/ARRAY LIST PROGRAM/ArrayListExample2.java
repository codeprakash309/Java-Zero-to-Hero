import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {
    public static void main(String[] args) {
        List<Integer> firtFivePrimeNumber=new ArrayList<Integer>();
        firtFivePrimeNumber.add(2);
        firtFivePrimeNumber.add(3);
        firtFivePrimeNumber.add(5);
        firtFivePrimeNumber.add(7);
        firtFivePrimeNumber.add(9);
        System.out.print("\n FirstFivePrimeNumber  are : "+firtFivePrimeNumber);
        List<Integer> nextFivePrimeNumber=new ArrayList<Integer>();
        nextFivePrimeNumber.add(11);
        nextFivePrimeNumber.add(13);
        nextFivePrimeNumber.add(15);
        nextFivePrimeNumber.add(17);
        nextFivePrimeNumber.add(19);
        System.out.print("\n NextFivePrimeNumber  are : "+nextFivePrimeNumber);
        //creating an ArrayList From another collection
        List<Integer> FirstTenPrimeNumber=new ArrayList<Integer>(firtFivePrimeNumber);
        //Adding an entire collection to an ArrayList
        FirstTenPrimeNumber.addAll(nextFivePrimeNumber);
        System.out.println("\n FirstTenPrimeNumber are : "+FirstTenPrimeNumber);

        
    }
}
