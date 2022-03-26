package day5;
class Animal{
	protected void display() {
		System.out.println("I am an animal");
	}
}
public class Animalclass extends Animal{
	public static void main(String[] args) {
		Animalclass dog=new Animalclass();
		dog.display();
	}

}
