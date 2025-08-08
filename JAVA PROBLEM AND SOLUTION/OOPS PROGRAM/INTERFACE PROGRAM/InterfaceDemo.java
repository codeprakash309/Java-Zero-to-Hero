interface College
{
	//inside an interface all the variable are by default public static final
	//if we declare a variable we bound to initialize that variable otherwise compile time error
	String ClgName="ABIT";  //this value can not be modify
	int ClgId=2222;       //this value can not be modify
	void display();    //inside an interface all method are by default public and abstract
	}
class  Student implements College
{
	String Sname;
	int Sage;
	int SrollNo;
	int Smarks;
	Student(String name,int age,int rollNo,int marks)
	{
		Sname=name;
		Sage=age;
       SrollNo=rollNo;
	   Smarks=marks;
	}
	public void display()
	{
      System.out.println("College Name : "+ClgName);
	  System.out.println("College Id : "+ClgId);
	  System.out.println("Student Name : "+Sname);
	  System.out.println("Student Age  : "+Sage);
	  System.out.println("rollNo : "+SrollNo);
	  System.out.println("Marks : "+Smarks);
	}
}  
class Teacher  implements College
{
	String Tname;
	String Tsub;
	Teacher(String Tname,String Tsub)
	{
         this.Tname=Tname;
		 this.Tsub=Tsub;
	}
public void display()
	{
      System.out.println("College Name : "+ClgName);
	  System.out.println("College Id : "+ClgId);
	  System.out.println("Teacher Name : "+Tname);
	  System.out.println("Subject  : "+Tsub);
	}
}
class InterfaceDemo
{
	public static void main(String[] args) 
	{
		Student s=new Student("prakash",23,101,80);
		s.display();
         System.out.println("**********************************************");
		Teacher t=new Teacher("durga","core java");
		t.display();
	}
}
