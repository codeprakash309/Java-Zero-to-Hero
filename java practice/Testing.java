
public class Testing {

	public void M1(int i, float f)
	{
	System.out.println("Hii");	
	}
	public void M1(float f, int i) {
	
		System.out.println("hello");
	}
	public static void main(String[] args) {
		Testing t=new Testing();
		t.M1(10,11.5f);
		//t.M1(10.5f,5);
		//t.M1(10,10);

	}

}
