package day5;
abstract class Lang{
	public void display() {
		System.out.println("This is Java Programming");
	}
}
public class Language extends Lang{
	public static void main(String[] args) {
		Language obj=new Language();
		obj.display();
	}

}
