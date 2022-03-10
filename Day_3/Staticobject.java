package day4;
class Static_A
{
	Static_B obj2;
	
	Static_A(Static_B obj1)
	{
		this.obj2=obj1;
		obj2.display();
	}
}
class Static_B
{
	int x=10;
	Static_B()
	{
		Static_A obj=new Static_A(this);
	}
	
	void display() 
	{
		System.out.println("B::x = "+x);
	}
}
public class Staticobject {
	public static void main(String[] args) 
	{
		Static_B obj=new Static_B();
	}

}
