class ConstructorP2
{ 
	ConstructorP2()
	{
         System.out.println("i am inside parent class constructor...");
	}
}
class Constructor1 extends ConstructorP2
{
	
	Constructor1(){
       System.out.println("i ma inside  child class constructor......");
	}
	public static void main(String[] args) 
	{
		ConstructorP2 obj=new ConstructorP2();
	}
}
