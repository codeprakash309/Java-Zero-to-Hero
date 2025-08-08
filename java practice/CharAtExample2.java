import java.util.Scanner;
public class CharAtExample2 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	System.out.print("enter a string print the first letter and middle and last letter : ");
	String str=sc.next();
	char ch[]=str.toCharArray();
	int x=(ch.length)/2;
	System.out.println(x);
	int d=ch.length-1;
	
		if(str.length()%2==0)
	     {
	    	 String s1=getMiddleChar(str);
	    	 System.out.println(s1);
	     }
		else {
		for(int i=0;i<ch.length;i++)
		{
		 if(ch[i]==ch[0]||ch[i]==ch[x]||ch[i]==ch[d])
		{
			System.out.println(ch[i]);	
			
		}
	  }//for loop end
	}

	} //main method end
	public static String getMiddleChar(String str)
	{
		StringBuffer sb=new StringBuffer();
		sb.append(str.subSequence(str.length()/2-1, str.length()/2+1));
		String s2=sb.toString();
		return s2;
	}

} //class end

