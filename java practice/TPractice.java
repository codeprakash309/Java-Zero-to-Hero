
public class TPractice {

	public static void main(String[] args) {
		int n=5;
		int m=2*n-1;
		for(int i=1;i<=m;i++)
		{
			for(int j=0;j<=m;j++)
			{
				if(j==(m-i+1))
				{
					System.out.print("*");
				}
				else if(i>=j) {
					for(int k=0;k<=n;k++) {
					System.out.print("#");
					}
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
		}

	}

}
