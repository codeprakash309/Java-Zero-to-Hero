//creating an ArrayList and adding new elements to it
import java.util.ArrayList;
class example1{
    public static void main(String[] args) {
        //creating an ArrayList of String
        ArrayList<String>animals=new ArrayList<String>();
        //adding new elements to the ArrayList
        animals.add("Elephant");
        animals.add("Tiger");
        animals.add("Deer");
        animals.add("zebra");
        animals.add("hipopotamus");
        System.out.println(animals);

        //adding an element at a particular index in an ArrayList
        animals.add(2,"Lion");
        System.out.println(animals);
       
    }
}