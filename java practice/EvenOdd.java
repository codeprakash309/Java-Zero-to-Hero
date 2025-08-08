import java.util.Scanner;
class A
{
	public void even(int num)
	{
		if(num%2==0)
		{
			System.out.println("even number");
		}
		else
			System.out.println("odd number");
	}
}

class B extends A {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		   System.out.println("Enter a number : ");
		   int num=sc.nextInt();
		   sc.close();  
           B t=new B();
           t.even(num);
        
	}

}
