class Circle 
{
	int radius;
	Circle(int r)
	{
   radius=r;
	}
	public boolean equals(Object o)
	{
         return radius==((Circle)o).radius;
		
	}
	public static void main(String[] args) 
	{
		Circle c1=new Circle(100);
		Circle c2=new Circle(100);
		System.out.println(c1.equals(c2));
	}
}
