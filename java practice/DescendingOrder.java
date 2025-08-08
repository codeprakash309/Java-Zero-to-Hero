
public class DescendingOrder {

	public static void main(String[] args) {
		int []arr={1,6,3,15,9,8,13,10,5};
		System.out.println("before array element are...");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println();
		System.out.println("desending arry element are....");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int temp=0;
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(" "+arr[i]);
		}

	}

}
