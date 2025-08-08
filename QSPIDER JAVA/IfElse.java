import java.util.Scanner;
class IfElse 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Password : ");
		String password=sc.nextLine();
		if(password==null||password.isEmpty()){
             System.out.println("empty password..");
		}else if(password.length()<8||password.equals("12345678"))
		{
           System.out.println("weak password..");
		}else
		{
        System.out.println("goood password....");
		}
	}
}
