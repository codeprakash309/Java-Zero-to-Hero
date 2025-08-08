import java.util.*;
class Program1 
{
	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet();
		t.add("A");
		t.add("D");
		t.add("C");
		t.add("F");
		t.add("A");
		t.add("B");
		System.out.println(t);
        System.out.println("C".compareTo("B"));
   	}
}
