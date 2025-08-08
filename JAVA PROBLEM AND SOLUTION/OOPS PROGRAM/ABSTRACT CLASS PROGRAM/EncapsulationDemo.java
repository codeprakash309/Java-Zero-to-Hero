class Employee
{
	private String name;
	public  void setName(String name)
	{
       this.name=name;
	}
	public String getName()
	{
     return name;
	}
}
class EncapsulationDemo 
{
	public static void main(String[] args) 
	{
		Employee e=new Employee();
		e.setName("Prakash");
		System.out.println("Name of the employee is  : "+e.getName());
	}
}
