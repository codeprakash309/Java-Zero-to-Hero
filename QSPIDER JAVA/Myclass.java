public class Myclass 
{
	//static method
	static void myStaticMethod(){
       System.out.println("static methods can be called without creating objects");
	}
	//public method
	public void myPublicMethod(){
     System.out.println("public methods must be called by creating objects");
	}
	//main method
	public static void main(String[] args) 
	{
		myStaticMethod(); //call thestatic method
		//myPublicMethod(); this would compile an error

		Myclass obj=new Myclass(); //Create an object of Myclass
		obj.myPublicMethod(); //call the public method on the object
	}
}
