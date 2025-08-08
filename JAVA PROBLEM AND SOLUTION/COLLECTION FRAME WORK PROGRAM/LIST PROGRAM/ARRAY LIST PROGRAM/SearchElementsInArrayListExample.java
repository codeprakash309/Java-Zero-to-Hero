import java.util.ArrayList;
import java.util.List;

public class SearchElementsInArrayListExample {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Steve");
        names.add("John");
        names.add("Steve");
        names.add("Maria");
        //Check if an ArrayList contains a given element
        System.out.println("Does names array contain \"Bob\"? : "+names.contains("Bob"));
        //Find the index of the first occurance of an element in an ArrayList
        System.out.println("IndexOf \"Steve\" : "+names.indexOf("Steve"));
        System.out.println("IndexOf \"Mark\" : "+names.indexOf("Mark")); 

        //find the index of the last occurance of an element in an ArrayList
        System.out.println("LastIndexOf \"John\" : "+names.lastIndexOf("John"));
        System.out.println("LastIndexOf \"Bill\" : "+names.lastIndexOf("Bill"));
    }
}
