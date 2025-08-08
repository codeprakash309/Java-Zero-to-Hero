import java.util.Scanner;
class TestSwitch 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Ënter a Name : ");
		String name=sc.next();
		//Starting with Java 7 we can use strings in Switch statement
		switch(name)
		{
         case "prakash":
			 System.out.println("i am praksh");
		 break;
		 case "prince":
			 System.out.println("i am prince");
		 break;
		 case "guddu":
			 System.out.println("i am guddu");
		 break;
		 default:
			 System.out.println("name not matching try another name....");
		}
	}
}
