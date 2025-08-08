import java.util.*;
class StackDemo   //obey LIFO  rule
{
	public static void main(String[] args) 
	{
		Stack <String>s=new Stack<String>();
		System.out.println("content of s = "+s); //[]
		System.out.println("size of s= "+s.size()); //10
		System.out.println("is empty? = "+s.empty());  //true
		s.push("durga");
		s.push("madhu");
		s.push("sasmita");
		s.push("guddu");
		s.push("crocodile");
		System.out.println("content of s = "+s);  //[durga,madhu,sasmita,guddu,crocodile]
		System.out.println("size of s= "+s.size()); //5
		System.out.println("is empty? = "+s.empty());  //false
		//remove th etop most element
		System.out.println("delete element : "+s.pop());
		System.out.println("content of s after pop  = "+s);//[durga, madhu, sasmita, guddu]
		//extract the top most element
       System.out.println("Top most element = "+s.peek()); //guddu
	   System.out.println("content of s after peek  = "+s);
	   //search the element prince and durga
	   int srp=s.search("prince");
	   System.out.println("stack relative pos.of prince is : "+srp);
	    int srp1=s.search("durga");
	   System.out.println("stack relative pos.of durga is : "+srp1);
	}
}
