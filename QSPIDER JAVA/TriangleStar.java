import java.util.Scanner;
class TriangleStar 
{
	public static void main(String[] args) 
	{
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter number of row : ");
		int n=scn.nextInt();
		System.out.println();
		for(int i=1;i<=n;i++){
             for(int j=i;j<=n;j++){
				System.out.print(" ");
		}
		 for(int k=1;k<=i;k++){
				System.out.print("* ");
		}
		System.out.println();
	}
}
}