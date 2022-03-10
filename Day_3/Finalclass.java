package day4;

final class Finalclass {
	public void display() {
		System.out.println("This is a final method.");
	}

}
class Main1 extends FinalDemo{
	public void display() {
		System.out.println("The final method is overriden.");
	}
	public static void main(String[] args) {
		Main1 obj=new Main1();
		obj.display();
	}

}
