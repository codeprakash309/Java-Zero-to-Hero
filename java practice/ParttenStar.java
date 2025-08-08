import java.util.Scanner;
public class ParttenStar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
         System.out.println("Enter no of row and column : ");
         int n=sc.nextInt();
         for(int i=0;i<n-1;i++) {
        	 System.out.println("*");
         }
         for(int j=0;j<n;j++) {
        	System.out.print("*"+" ");       	 
         
	}
	}

}
