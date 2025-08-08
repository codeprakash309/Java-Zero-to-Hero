import java.util.*;
public class subsequence {
    //declaring a global list
	static List<String>a1=new ArrayList<>();
	//creating a public static ArrayList such that
	//we can store values
	//we can directly return too //public static
	//ArrayList<String> a1=new ArrayList<String>();
	public static void main(String[] args) {
		String s="abcd";
		findsubsequences(s," "); //calling a function
		System.out.println(a1);

	}

	private static void findsubsequences(String s,String ans)
	{
		if(s.length()==0)
		{
			a1.add(ans);
			return;
		}
		//we add adding 1st character in String
		findsubsequences(s.substring(1) ,ans+s.charAt(0));
		//not adding first character of the string
		//because the concept of subsequence either
		//character will present or not
		findsubsequences(s.substring(1),ans);
		
	}
}
