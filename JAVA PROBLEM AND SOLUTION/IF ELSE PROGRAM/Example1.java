import java.util.Scanner;
class Example1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  your full mark  : ");
		int mark=sc.nextInt();
        float percentage=(mark/6);
		System.out.println(percentage);
		if(40==percentage)
			System.out.println("pass");
		else if(40<=percentage&&percentage>=59)
			System.out.println("Second division");
		else if(60<=percentage||percentage>=80)
			System.out.println("first division");
		else if(80<=percentage||percentage>=100)
			System.out.println("distinction");
	}
}
