//write a program to traverse (or iterate) ArrayList

import java.util.ArrayList;

/**
 * ArrayListLoopExample
 */
public class ArrayListLoopExample {

    public static void main(String[] args) {
        //initialize ArrayList
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(3);
        al.add(8);
        al.add(9);
        al.add(5);
        System.out.println("using advanced for loop");
        //prionitng the ArrayList
        for(Integer num:al)
        {
            System.out.print(num+" ");
        }


    }
}