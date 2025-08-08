import java.util.Scanner;
public class SpecialSymbol {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the special character from the keyboard : ");
		char ch=sc.next().charAt(0);
		if(ch=='~'||ch=='@'||ch=='#'||ch=='$'||ch=='%'||ch=='^'||ch=='&'||ch=='*'||ch=='('||ch==')'||ch=='.'||ch=='"'||ch=='?'||ch=='-'||ch=='_'||ch=='+'||ch==','||ch=='/'||ch=='='||ch==';'||ch==':'||ch=='{'||ch=='}'||ch=='['||ch==']')
		{
			System.out.println(ch+" is a special character");
			
		}
		else
			System.out.println(ch+" is not a special character");

sc.close();

	}

}
