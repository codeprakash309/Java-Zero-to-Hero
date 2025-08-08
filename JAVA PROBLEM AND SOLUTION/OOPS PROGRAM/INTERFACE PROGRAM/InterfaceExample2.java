interface shape
{
	void draw();
}
class Circle implements shape
{
	//override draw method in circle class
	public void draw()
	{
    System.out.println("drawing circle...........");
	}
}
class Rectangle implements shape
{
	//override draw method in rectangle class
	public void draw()
	{
    System.out.println("drawing Rectangle...........");
	}
}
class InterfaceExample2 
{
	public static void main(String[] args) 
	{
	//always use an interface type as an interface type
	shape s=new Circle();
	//shape s=new Rectangle();
	print(s);
	}
	private static void print(shape s)       //here shape is a interface type use as an argument type
	{
    s.draw();
	}
}
