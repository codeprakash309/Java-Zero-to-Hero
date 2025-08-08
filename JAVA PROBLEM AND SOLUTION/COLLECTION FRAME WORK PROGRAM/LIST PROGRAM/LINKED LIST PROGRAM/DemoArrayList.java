import java.util.*;
class DemoArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();   //creating an arraylist
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		Iterator itr=al.iterator();  //getting Iterator from arraylist to traverse elements
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
	}
}
