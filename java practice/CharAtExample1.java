import java.util.Scanner;
public class CharAtExample1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String for check the certain index position : ");
        String str=sc.nextLine();
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++) {
        	if(i%2==0)
                System.out.println(ch[i]);
        	
        	     
        }
	}

}
