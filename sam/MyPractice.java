package sam;
//import java.util.Scanner;
class Circle{
	public int r;
	
	public Circle(int r) {
		this.r=r;
	}
	public int getRadius() {
		return r;
	}		
	//public Animal(String a) {
		//this.a=a;
	//}
	public void setRadius(int r) {
		this.r=r;
	}
	public double Area() {
		return Math.PI*r*r;
	}
}
class Cylinder extends Circle{
	public Cylinder(int r) {
	super(r);
		// TODO Auto-generated constructor stub
	}
	public String b;
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b=b;
	}
	
}
public class MyPractice{
	public static void main(String[] args) {
		Animal an=new Animal();
		Dog d=new Dog();
		an.setAnimal("Tommy");
		d.setB("Husky");
		System.out.println(an.getAnimal());
		System.out.println(d.getB());
		
		//System.out.println(c.getRadius());
		//System.out.println(c.surfaceArea());
		//System.out.println(c.volume());
	}
}
	