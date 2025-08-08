//difference between HashSet and HashMap
//HashSet contains only values whereas HashMap contains an Entry(key and value)
import java.util.*;
class Book{
    int id;
    String name,author,publisher;
    int quantity;
    public Book(int id,String name,String author,String publisher,int quantity)
    {
        this.id=id;
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.quantity=quantity;
    }
}
public class HashMapExample6 {
    public static void main(String[] args) {
        //creating Map of Books
        Map<Integer,Book>m=new HashMap<Integer,Book>();
        //creating Book
        Book b1=new Book(101,"java","kathysiera","BPB",8);
        Book b2=new Book(102,"Python","Denis","Amazone",4);
        Book b3=new Book(103,"MySQL","owama","Oracle",5);
        //Adding Books to Map
        m.put(1,b1);
        m.put(2,b2);
        m.put(3,b3);

        //traversing Map
        for (Map.Entry<Integer,Book> mp:m.entrySet()) {
            int key=mp.getKey();
            Book b=mp.getValue();
            System.out.println("Details : "+key);
            System.out.println(b.id+" : "+b.name+" : "+b.author+" : "+b.publisher+" : "+b.quantity);
        }
    }
}
