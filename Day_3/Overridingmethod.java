package day4;
class Animal1{
	public void display() {
		System.out.println("I am an animal");
	}
}
class Dog1 extends Animal1{
	@Override
	public void display() 
	{
		System.out.println("I am a dog");
	}
	public void printMessage()
	{
		super.display();
		display();
	}
}
public class Overridingmethod {
	public static void main(String[] args) 
	{
		Dog1 dog1=new Dog1();
		dog1.printMessage();
	}

}
