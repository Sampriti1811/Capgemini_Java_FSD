package day4;

public class Finalvoid {
	public final void display() {
		System.out.println("This is a final method.");
	}

}
class Main extends FinalDemo{
	public final void display() {
		System.out.println("The final method is overriden.");
	}
	public static void main(String[] args) {
		Main obj=new Main();
		obj.display();
	}
}
