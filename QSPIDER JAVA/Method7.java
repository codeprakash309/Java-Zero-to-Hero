class Method7 
{
	public void M2(int y){
System.out.println("int arg method");
int x=5;
x++;
System.out.println(x);
System.out.println(y);
	}
	public static void main(String[] args) 
	{
		System.out.println("Main method start");
		 Method7 obj =new  Method7();
		 obj.M2(10);
	}
}
