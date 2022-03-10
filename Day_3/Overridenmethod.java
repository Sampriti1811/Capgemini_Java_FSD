package day4;
class Animal{
	public void display() {
		System.out.println("I am an animal");
	}
}
class Dog extends Animal{
	@Override
	public void display() {
		super.display();
		System.out.println("I am a dog");
	}
	public void printMessage(){
		display();
	}
}
public class Overridenmethod {
	public static void main(String[] args) {
		Dog dog1=new Dog();
		dog1.printMessage();
	}

}
