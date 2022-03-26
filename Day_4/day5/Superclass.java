package day5;
class Animal1{
	String name;
	public void eat() {
		System.out.println("I can eat");
	}
}
class Dog extends Animal1{
	public void display() {
		System.out.println("My name is "+name);
	}
}
public class Superclass {
	public static void main(String[] args) {
		Dog labrador=new Dog();
		labrador.name="Rohu";
		labrador.display();
		labrador.eat();
	}

}
