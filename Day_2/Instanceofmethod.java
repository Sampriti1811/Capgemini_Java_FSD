package comm.cg;
class Fruit{}
class Vehicle{}
public class Instanceofmethod
{
	public static void main(String[] args)
	{
		Fruit apple = new Fruit();
		Vehicle car = new Vehicle();
		Vehicle car=null;
		
		System.out.println("car IS A Fruit: " + (car instanceof Fruit));
	}
}