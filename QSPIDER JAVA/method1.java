//non-primitive type argument

class method1 
{
	public void K(String s){
 System.out.println(s);

	}
	public static void main(String[] args) 
	{
		System.out.println("main method Starts");
		method1 obj= new method1();
		obj.K("abc");
		obj.K(null);
		obj.K(new String("good boy"));
	}
}
