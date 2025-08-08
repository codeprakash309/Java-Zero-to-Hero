//how to differentiate formal parameters and data memeber in a program
class TestConstructor 
{
	int a,b,c;
	TestConstructor(int a,int b)
	{
       this.a=a;   //this pointing to the current class object's data members
	   this.b=b;
	}
	public void M1(TestConstructor  T)  //here T is a formal parameter 
	{
		
        System.out.println("VALUE OF a BELONGS TO DATA MEMBERS  : "+this.a);
		System.out.println("VALUE OF b BELONGS TO DATA MEMBERS  : "+this.b);
		System.out.println("VALUE OF a BELONGS TO FORMAL OBJECT MEMBERS  : "+T.a);
		System.out.println("VALUE OF b BELONGS TO FORMAL OBJECT MEMBERS  : "+T.b);
	}
	public static void main(String[] args) 
	{
		TestConstructor obj=new TestConstructor(10,20);
		TestConstructor obj2=new TestConstructor(50,60);
		obj.M1(obj2);  //SOURCE OBJECT. METHOD NAME (TARGET OBJECT);
	}
}
