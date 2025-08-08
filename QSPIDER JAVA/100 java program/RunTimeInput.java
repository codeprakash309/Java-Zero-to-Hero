//write a program to take input from user and print in concole 
import java.util.Scanner;
class  RunTimeInput
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name :  ");
		String name=sc.nextLine();
		System.out.print("Enter your Age :  ");
		int age=sc.nextInt();
		System.out.print("Enter your mobile number : ");
		long mobno=sc.nextLong();
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Mobile No : "+mobno);
	}
}
