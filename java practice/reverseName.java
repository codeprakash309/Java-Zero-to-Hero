import java.util.Scanner;

/**
 * reverseName
 */
public class reverseName {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Name : ");
       String name= sc.nextLine();
       String rev="";
       for(int i=0;i<name.length();i++)
       {
    	   char ch=name.charAt(i);
    	   rev=ch+rev;
       }
       System.out.println("reverse name is : "+rev);
       sc.close();
    }
}