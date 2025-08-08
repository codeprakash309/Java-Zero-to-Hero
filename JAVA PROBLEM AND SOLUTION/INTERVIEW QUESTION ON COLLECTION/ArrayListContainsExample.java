//given an element write a program to check if element(value) exits in ArrayList

import java.util.ArrayList;

public class ArrayListContainsExample {
    public static void main(String[] args) {
        //initialize ArrayList
        ArrayList<Integer> al=new ArrayList<Integer>(); 
        //add elememts to ArrayList object
        al.add(12);
        al.add(5);
        al.add(8);
        al.add(9);
        //check if ArrayList contains element
        if(al.contains(12))
        {
            System.out.println("12 is found in the List ");
        }else{
            System.out.println("12 was not found in the List");
        }
    }
}
